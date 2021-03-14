class Main {
  public static void main(String[] args) {
  System.out.println("Hello world!");
  Node node1 = new Node(31,16,45);
  Node node2 = new Node(45,null,null);
  Node node3 = new Node(16,7,24);
  Node node4 = new Node(7,null,null);
  Node node5 = new Node(24,19,29);
  Node node6 = new Node(19,null,null);
  Node node7 = new Node(29,null,null);
  
  Node.addNode(node1, node1);
  Node.addNode(node1, node2);
  Node.addNode(node1, node3);
  Node.addNode(node3, node4);
  Node.addNode(node3, node5);
  Node.addNode(node5, node6);
  Node.addNode(node5, node7);
  }
}
