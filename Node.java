class Node {
  //atributes

  private int data;
  private Node left;
  private Node right;

  public Node(int data) {
    this.data = data;
  }
  //getters

  public Node getLeft() {
    return left;
  }

  public Node getRight() {
    return right;
  }

  public int getData() {
    return data;
  }

  //setters

  public void setLeft(Node left) {
    this.left = left;
  }

  public void setRight(Node right) {
    this.right = right;
  }

  //methods

  //Add Node
  
  public static void addNode(Node currentNode, Node newNode) {
    int currentData = newNode.getData();
    while (currentNode.getData() != 0) {
      if (currentData > currentNode.getData()) {
        if (currentNode.getRight() != null) {
          currentNode = currentNode.getRight();
        } else {
          currentNode.setRight(newNode);
          break;
        }
      } else {
        if (currentNode.getLeft() != null) {
          currentNode = currentNode.getLeft();
        } else {
          currentNode.setLeft(newNode);
          break;
        }
      }
    }
  }

  public static void breadthFirst(Node root) {
    ArrayList<Node> toVisit = new ArrayList<Node>();
    toVisit.add(root);
    while(toVisit.size() > 0) {
      Node currentNode = toVisit.get(0);
      if (currentNode.getLeft() != null) {
        toVisit.add(currentNode.getLeft());
      }
      if (currentNode.getRight() != null) {
        toVisit.add(currentNode.getRight());
      }
      System.out.println(currentNode.getData());
      toVisit.remove(0);
    }
  }


  public static void postOrder(Node node) {
    if (node.getLeft() != null) postOrder(node.getLeft());
    if (node.getRight() != null) postOrder(node.getRight());
    System.out.println(node.getData());
  }

  // not sure if I have coded this correctly
  // it does work as intended though
  public static void removeSubtree(Node root, int value) {
    ArrayList<Node> toVisit = new ArrayList<Node>();
    toVisit.add(root);
    while(toVisit.size() > 0) {
      Node currentNode = toVisit.get(0);
      if (currentNode.getLeft() != null) {
        toVisit.add(currentNode.getLeft());
      }
      if (currentNode.getRight() != null) {
        toVisit.add(currentNode.getRight());
      }
      toVisit.remove(0);
      if (currentNode.getLeft().getData() == value) {
        currentNode.setLeft(null);
        toVisit.clear();
      }
      if (currentNode.getRight().getData() == value) {
        currentNode.setRight(null);
        toVisit.clear();
      }
    }
  } 
}        

    