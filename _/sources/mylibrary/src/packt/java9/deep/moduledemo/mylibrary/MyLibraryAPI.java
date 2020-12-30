package packt.java9.deep.moduledemo.mylibrary;

import packt.java9.deep.moduledemo.mylibrary.internal.Implementation;
import packt.java9.deep.moduledemo.thirdpartylibrary.ThirdpartylibraryAPI;

public class MyLibraryAPI {

  private static int x = 1;

  public static ThirdpartylibraryAPI getAPI() {
    return Implementation.internal();
  }
}
