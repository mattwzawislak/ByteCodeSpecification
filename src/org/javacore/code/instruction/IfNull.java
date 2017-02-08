package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IfNull extends BranchInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IFNULL;
    }
}
