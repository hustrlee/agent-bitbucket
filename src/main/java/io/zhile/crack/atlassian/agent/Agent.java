package io.zhile.crack.atlassian.agent;

import java.lang.instrument.Instrumentation;

/**
 * @author pengzhile
 * @link https://zhile.io
 * @version 1.0
 */
public class Agent {
    public static void premain(String args, Instrumentation inst) {

        final String atlassian_dir = args;

        try {
            inst.addTransformer(new KeyTransformer(atlassian_dir));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
