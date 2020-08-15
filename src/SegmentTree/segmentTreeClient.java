package SegmentTree;

public class segmentTreeClient
{
    public static void main(String[] args) {

        int[] a = {3, 8 , 7, 6, -2, -8, 4, 9, 2};
        segmentTree st = new segmentTree(a);
 //       st.display();
        System.out.println(st.sumInRange(2,6));
    }
}
