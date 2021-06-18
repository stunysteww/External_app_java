package com.company;

import java.io.*;

class GFG {

public static void main(String[] args)

{

Runtime runtime = Runtime.getRuntime();

try {

runtime.exec( command: "notepad.exe");

//OR runtime.exec("notepad");

} catch (IOException e) {

e.printStackTrace();

}

}
