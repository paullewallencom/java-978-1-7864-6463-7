package packt.java9.deep.moduledemo.main;

import packt.java9.deep.moduledemo.mylibrary.MyLibraryAPI;

import java.lang.reflect.Field;


public class Main {

  public static void main(String[] args) throws Exception {
    Field f = MyLibraryAPI.class.getDeclaredField("x");
    f.setAccessible(true);
    int z = (int)f.get(null);
    System.out.println(""+z);
//    ThirdpartylibraryAPI api = MyLibraryAPI.getAPI();
//    api.printHello();
  }

}
