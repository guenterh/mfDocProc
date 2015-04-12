package org.swissbib.mf.functions;

import org.culturegraph.mf.morph.NamedValueReceiver;
import org.culturegraph.mf.morph.NamedValueSource;
import org.culturegraph.mf.morph.functions.AbstractSimpleStatelessFunction;
import org.culturegraph.mf.morph.functions.Function;
import org.culturegraph.mf.types.MultiMap;
import org.culturegraph.mf.util.xml.Location;

import java.util.HashMap;
import java.util.Objects;

/**
 * Created by swissbib on 11.04.15.
 */
public class ComposeLinks extends AbstractSimpleStatelessFunction {

    String myValue;


    public void setmyvalue(String o) {
        this.myValue = o;
    }

    @Override
    protected String process(String value) {
        return value;
    }
}
