package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface DLoad_3 extends LoadInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DLOAD_3;
    }
}
