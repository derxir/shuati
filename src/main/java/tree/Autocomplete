package tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by jyue on 6/18/2018.
 */
public class Autocomplete {
    private Node trie;

    public Autocomplete(String[] dict) {
        trie = new Node("");
        for (String s : dict) insertWord(s);
    }

    public static void main(String[] agrs) {
        String[] dict = {"abc", "abd"};
        Autocomplete a = new Autocomplete(dict);
        System.out.println(a.getWordsByPrefix("ab"));
    }

    private void insertWord(String s) {
        char[] schar = s.toCharArray();
        Node curr = trie;
        for (int i = 0; i < schar.length; i++) {
            if (!curr.children.containsKey(schar[i])) {
                curr.children.put(schar[i], new Node(s.substring(0, i + 1)));
            }
            curr = curr.children.get(schar[i]);
            if (i == s.length() - 1) curr.isWord = true;
        }
    }

    public List<String> getWordsByPrefix(String prefix) {
        List<String> list = new LinkedList<>();
        Node curr = this.trie;

        for (int i = 0; i < prefix.length(); i++) {
            if (!curr.children.containsKey(prefix.charAt(i))) {
                return list;
            } else {
                curr = curr.children.get(prefix.charAt(i));
            }
        }
        findAllPref(curr, list);
        return list;
    }

    private void findAllPref(Node node, List<String> list) {
        System.out.println(node.pre + "<< Node level");
        if (node.isWord) list.add(node.pre);
        for (Character c : node.children.keySet()) {
            findAllPref(node.children.get(c), list);
        }

    }

    private class Node {
        String pre;
        Map<Character, Node> children;
        boolean isWord;

        Node(String s) {
            this.pre = s;
            children = new HashMap<>();
        }
    }
}
