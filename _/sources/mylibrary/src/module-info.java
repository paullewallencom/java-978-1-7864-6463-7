module mylibrary {
    exports packt.java9.deep.moduledemo.mylibrary;
    opens packt.java9.deep.moduledemo.mylibrary;
    requires transitive thirdpartylibrary;
}

