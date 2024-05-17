package main.java.virtualobeya;

import main.java.virtualobeya.extract.Extract;
import main.java.virtualobeya.load.Load;
import main.java.virtualobeya.transform.Transform;

public class Main {
    public static void main(String[] args) {
        Extract extract = new Extract();
        Transform transform = new Transform();
        Load load = new Load();
    }
}