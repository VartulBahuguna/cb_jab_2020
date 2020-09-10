package Sockets;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer extends JFrame{
    private  JTextArea msg_area;
    private  JTextField msg_txt;
    private JButton send;
    private JPanel panelMain;

    private static ServerSocket ss;
    private static Socket s;
    private static DataOutputStream dout;
    private static DataInputStream din;


    public ChatServer() {
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msgout = "";
                msgout = msg_txt.getText().trim();
              //  assert msgout != null;
                try {
                    dout.writeUTF(msgout);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                msg_txt.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        ChatServer cs = new ChatServer();
        frame.setContentPane(cs.panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        String msgin = "";

        try
        {
            ss = new ServerSocket(1201);
            s = ss.accept();

            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());

            while(!msgin.equals("exit")){
                msgin = din.readUTF();
                cs.msg_area.setText(cs.msg_area.getText().trim() + "\n" + msgin);

            }
        }catch (Exception e)
        {
            System.out.println("----> " + e);
        }
    }

}
