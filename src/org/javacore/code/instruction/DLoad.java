package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface DLoad extends LoadInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DLOAD;
    }
}
