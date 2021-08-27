import memento.Editor;
import memento.History;

class Main {
  public static void main(String[] args) {
    var history = new History();
    var editor = new Editor();
    editor.setContent("b");
    history.push(editor.createState());
    editor.setContent("e");
    editor.restoreState(history.pop());
    System.out.println(editor.getContent());
  }
}