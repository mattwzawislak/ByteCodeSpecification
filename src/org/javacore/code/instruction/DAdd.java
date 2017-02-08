package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface DAdd extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DADD;
    }
}
