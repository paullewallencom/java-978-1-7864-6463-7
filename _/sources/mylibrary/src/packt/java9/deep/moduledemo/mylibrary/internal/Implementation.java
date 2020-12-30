package packt.java9.deep.moduledemo.mylibrary.internal;

import packt.java9.deep.moduledemo.thirdpartylibrary.ThirdpartylibraryAPI;

public class Implementation {

  public static ThirdpartylibraryAPI internal() {
    return new ThirdpartylibraryAPI();
  }
}
