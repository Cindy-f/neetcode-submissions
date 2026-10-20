/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        Map<Node, Node> oldToNew = new HashMap<>();
        return dfs(node, oldToNew);
    }

    private Node dfs(Node node, Map<Node, Node> oldToNew) {
        if (node == null) {
            return null;
        }
        // Return cached clone if already visited
        if (oldToNew.containsKey(node)) {
            return oldToNew.get(node);
        }
        // Clone current node and record it in the map
        Node copy = new Node(node.val);
        oldToNew.put(node, copy);
        // Recursively clone neighbors
        for (Node nei: node.neighbors) {
            copy.neighbors.add(dfs(nei, oldToNew));
        }
        return copy;
    }
}