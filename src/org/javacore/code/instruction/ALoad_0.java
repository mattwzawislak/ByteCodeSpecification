package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface ALoad_0 extends LoadInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ALOAD_0;
    }
}
