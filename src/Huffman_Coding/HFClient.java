package Huffman_Coding;

public class HFClient
{
    public static void main(String[] args)
    {
        String str = "abbccdaa";
        HuffManEncoder hf = new HuffManEncoder(str);
        String codedString = hf.encoded(str);
        String deCodedString = hf.decode(codedString);

        System.out.println(codedString);
        System.out.println(deCodedString);
    }


}
