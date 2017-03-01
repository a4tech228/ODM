package TIIT;


import java.util.Scanner;
import java.util.*;

import static TIIT.HuffmanCode.OSTIS;


    class HuffmanNode extends HuffmanTree {
    public final HuffmanTree left, right; // subtrees




    public HuffmanNode(HuffmanTree l, HuffmanTree r) {
        super(l.frequency + r.frequency);
        left = l;
        right = r;
    }



    public static void printCodes(HuffmanTree tree, StringBuffer prefix) {
        assert tree != null;
        if (tree instanceof HuffmanLeaf) {
            HuffmanLeaf leaf = (HuffmanLeaf) tree;
            System.out.println(leaf.value + "\t\t" + leaf.frequency + "   \t\t" + prefix);

        } else if (tree instanceof HuffmanNode) {
            HuffmanNode node = (HuffmanNode) tree;

            prefix.append('0');
            printCodes(node.left, prefix);
            prefix.deleteCharAt(prefix.length() - 1);
            prefix.append('1');
            printCodes(node.right, prefix);
            prefix.deleteCharAt(prefix.length() - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println("Input string: ");
        Scanner str = new Scanner(System.in);
        String s = str.nextLine();
        int[] charFreqs = new int[256];
        for (char c : s.toCharArray())
            charFreqs[c]++;



        HuffmanTree tree;
        tree = OSTIS(charFreqs);

        System.out.println("SYMBOL\tFREQUENCE\tHUFFMAN CODE");
        printCodes(tree, new StringBuffer());
    }

}