package TIIT;

import java.util.PriorityQueue;



import java.util.*;



class HuffmanLeaf extends HuffmanTree {
    public final char value;

    public HuffmanLeaf(int freq, char val) {
        super(freq);
        value = val;
    }
}

class HuffmanTree implements Comparable<HuffmanTree> {
    public final int frequency;
    public HuffmanTree(int freq) { frequency = freq; }


    public int compareTo(HuffmanTree tree) {
        return frequency - tree.frequency;
    }
}


public class HuffmanCode {

    public static HuffmanTree OSTIS(int[] charFreqs) {
        PriorityQueue<HuffmanTree> trees = new PriorityQueue<HuffmanTree>();
        for (int i = 0; i < charFreqs.length; i++)
            if (charFreqs[i] > 0)
                trees.offer(new HuffmanLeaf(charFreqs[i], (char)i));

        assert trees.size() > 0;

        while (trees.size() > 1) {

            HuffmanTree a = trees.poll();
            HuffmanTree b = trees.poll();

            trees.offer(new HuffmanNode(a, b));
        }
        return trees.poll();
    }
}