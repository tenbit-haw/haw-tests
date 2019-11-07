package cn.tenbit.haw.sometests.test001;

import cn.tenbit.haw.core.util.HawConsoles;

/**
 * @author bangquan.qian
 * @date 2019-11-06 21:33
 */
public class Human {

    {
        HawConsoles.sout("human-block-1");
    }

    static {
        HawConsoles.sout("human-static-1");
    }

//    public Human() {
////        this("");
//        HawConsoles.sout("human-constructor");
//    }

    public Human(String sex) {
//        this();
        HawConsoles.sout("human-with-sex-constructor");
    }

    {
        HawConsoles.sout("human-block-2");
    }

    static {
        HawConsoles.sout("human-static-2");
    }
}
