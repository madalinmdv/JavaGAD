package memento_pattern;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("madalin");
        history.push(editor.crateState());

        editor.setContent("dragos");
        history.push(editor.crateState());

        editor.setContent("andrei");
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}
