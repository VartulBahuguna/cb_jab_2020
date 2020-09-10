package Sockets;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {
    private JTextField msg_txt;
    private JTextArea msg_area;
    private JButton send;
    private JPanel panelMain;

    private static ServerSocket ss;
    private static Socket s;
    private static DataOutputStream dout;
    private static DataInputStream din;

    public ChatClient() {
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
        ChatClient cc = new ChatClient();
        frame.setContentPane(cc.panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        try{
            s = new Socket("127.0.0.1", 1201);
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            String msgin = "";
            while (!msgin.equals("exit")){
                msgin = din.readUTF();
                cc.msg_area.setText(cc.msg_area.getText().trim() + "\nServer:\t" + msgin);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
