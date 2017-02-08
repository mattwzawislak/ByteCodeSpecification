package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface FCmpL extends ComparisonInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.FCMPL;
    }
}
