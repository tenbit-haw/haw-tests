package cn.tenbit.haw.sometests.test001;

import cn.tenbit.haw.core.util.HawConsoles;

/**
 * @author bangquan.qian
 * @date 2019-11-06 21:33
 */
public class Person extends Human {

    static {
        HawConsoles.sout("person-static-1");
    }

    {
        HawConsoles.sout("person-block-1");
    }

    public Person() {
        //super("");
        this("");
        //super();
        HawConsoles.sout("person-constructor");
    }


    {
        HawConsoles.sout("person-block-2");
    }

    static {
        HawConsoles.sout("person-static-2");
    }

    public Person(String name) {
        //this();
        super("");
        HawConsoles.sout("person-with-name-constructor");
    }


    {
        HawConsoles.sout("person-block-3");
    }

    static {
        HawConsoles.sout("person-static-3");
    }
}
