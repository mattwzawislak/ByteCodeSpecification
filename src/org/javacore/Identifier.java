package org.javacore;

/**
 */
public enum Identifier {

    CLASS,
    FIELD,
    METHOD,
    CODE,

    // annotations

    ANNOTATION,
    TYPE_ANNOTATION,

    ELEMENT_VALUE_PAIR,

    ELEMENT_VALUE,

    ANNOTATION_ELEMENT_VALUE,
    ARRAY_ELEMENT_VALUE,
    BOOLEAN_ELEMENT_VALUE,
    BYTE_ELEMENT_VALUE,
    CHARACTER_ELEMENT_VALUE,
    CLASS_ELEMENT_VALUE,
    DOUBLE_ELEMENT_VALUE,
    ENUM_ELEMENT_VALUE,
    FLOAT_ELEMENT_VALUE,
    INTEGER_ELEMENT_VALUE,
    LONG_ELEMENT_VALUE,
    SHORT_ELEMENT_VALUE,
    STRING_ELEMENT_VALUE,

    // attributes

    ATTRIBUTE,

    ANNOTATION_DEFAULT_ATTRIBUTE,
    BOOTSTRAP_METHODS_ATTRIBUTE,
    CODE_ATTRIBUTE,
    CONSTANT_VALUE_ATTRIBUTE,
    DEPRECATED_ATTRIBUTE,
    ENCLOSING_METHOD_ATTRIBUTE,
    EXCEPTIONS_ATTRIBUTE,
    INNER_CLASSES_ATTRIBUTE,
    LINE_NUMBER_TABLE_ATTRIBUTE,
    LOCAL_VARIABLE_TABLE_ATTRIBUTE,
    LOCAL_VARIABLE_TYPE_TABLE_ATTRIBUTE,
    METHOD_PARAMETERS_ATTRIBUTE,
    RUNTIME_INVISIBLE_ANNOTATIONS_ATTRIBUTE,
    RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS_ATTRIBUTE,
    RUNTIME_INVISIBLE_TYPE_ANNOTATIONS_ATTRIBUTE,
    RUNTIME_VISIBLE_ANNOTATIONS_ATTRIBUTE,
    RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS_ATTRIBUTE,
    RUNTIME_VISIBLE_TYPE_ANNOTATIONS_ATTRIBUTE,
    SIGNATURE_ATTRIBUTE,
    SOURCE_DEBUG_EXTENSION_ATTRIBUTE,
    SOURCE_FILE_ATTRIBUTE,
    STACK_MAP_TABLE_ATTRIBUTE,
    SYNTHETIC_ATTRIBUTE,
    UNKNOWN_ATTRIBUTE,

    // code label

    LABEL,

    // code block

    CODE_BLOCK_TABLE,
    CODE_BLOCK,
    FRAME_CODE_BLOCK,
    IMPLICIT_CODE_BLOCK,
    LINE_CODE_BLOCK,
    NAMED_CODE_BLOCK,

    // code frame

    STACK_MAP_FRAME,
    APPEND_FRAME,
    CHOP_FRAME,
    FULL_FRAME,
    SAME_FRAME,
    SAME_FRAME_EXTENDED,
    SAME_LOCALS_1_STACK_ITEM_FRAME,
    SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED,

    // code frame verification
    VERIFICATION_TYPE_INFO,

    DOUBLE_VARIABLE_INFO,
    FLOAT_VARIABLE_INFO,
    INTEGER_VARIABLE_INFO,
    LONG_VARIABLE_INFO,
    NULL_VARIABLE_INFO,
    OBJECT_VARIABLE_INFO,
    TOP_VARIABLE_INFO,
    UNINITIALIZED_THIS_VARIABLE_INFO,
    UNINITIALIZED_VARIABLE_INFO,

    // code instruction
    INSTRUCTION,

    AALOAD,
    AASTORE,
    ACONST_NULL,
    ALOAD,
    ALOAD_0,
    ALOAD_1,
    ALOAD_2,
    ALOAD_3,
    ANEWARRAY,
    ARETURN,
    ARRAYLENGTH,
    ASTORE,
    ASTORE_0,
    ASTORE_1,
    ASTORE_2,
    ASTORE_3,
    ATHROW,
    BALOAD,
    BASTORE,
    BIPUSH,
    CALOAD,
    CASTORE,
    CHECKCAST,
    D2F,
    D2I,
    D2L,
    DADD,
    DALOAD,
    DASTORE,
    DCMPG,
    DCMPL,
    DCONST_0,
    DCONST_1,
    DDIV,
    DLOAD,
    DLOAD_0,
    DLOAD_1,
    DLOAD_2,
    DLOAD_3,
    DMUL,
    DNEG,
    DREM,
    DRETURN,
    DSTORE,
    DSTORE_0,
    DSTORE_1,
    DSTORE_2,
    DSTORE_3,
    DSUB,
    DUP,
    DUP2,
    DUP2_X1,
    DUP2_X2,
    DUP_X1,
    DUP_X2,
    F2D,
    F2I,
    F2L,
    FADD,
    FALOAD,
    FASTORE,
    FCMPG,
    FCMPL,
    FCONST_0,
    FCONST_1,
    FCONST_2,
    FDIV,
    FLOAD,
    FLOAD_0,
    FLOAD_1,
    FLOAD_2,
    FLOAD_3,
    FMUL,
    FNEG,
    FREM,
    FRETURN,
    FSTORE,
    FSTORE_0,
    FSTORE_1,
    FSTORE_2,
    FSTORE_3,
    FSUB,
    GETFIELD,
    GETSTATIC,
    GOTO,
    GOTO_W,
    I2B,
    I2C,
    I2D,
    I2F,
    I2L,
    I2S,
    IADD,
    IALOAD,
    IAND,
    IASTORE,
    ICONST_0,
    ICONST_1,
    ICONST_2,
    ICONST_3,
    ICONST_4,
    ICONST_5,
    ICONST_M1,
    IDIV,
    IF_ACMPEQ,
    IF_ACMPNE,
    IF_ICMPEQ,
    IF_ICMPGE,
    IF_ICMPGT,
    IF_ICMPLE,
    IF_ICMPLT,
    IF_ICMPNE,
    IFEQ,
    IFGE,
    IFGT,
    IFLE,
    IFLT,
    IFNE,
    IFNONNULL,
    IFNULL,
    IINC,
    ILOAD,
    ILOAD_0,
    ILOAD_1,
    ILOAD_2,
    ILOAD_3,
    IMUL,
    INEG,
    INSTANCEOF,
    INVOKEDYNAMIC,
    INVOKEINTERFACE,
    INVOKESPECIAL,
    INVOKESTATIC,
    INVOKEVIRTUAL,
    IOR,
    IREM,
    IRETURN,
    ISHL,
    ISHR,
    ISTORE,
    ISTORE_0,
    ISTORE_1,
    ISTORE_2,
    ISTORE_3,
    ISUB,
    IUSHR,
    IXOR,
    JSR,
    JSR_W,
    L2D,
    L2F,
    L2I,
    LADD,
    LALOAD,
    LAND,
    LASTORE,
    LCMP,
    LCONST_0,
    LCONST_1,
    LDC,
    LDC2_W,
    LDC_W,
    LDIV,
    LLOAD,
    LLOAD_0,
    LLOAD_1,
    LLOAD_2,
    LLOAD_3,
    LMUL,
    LNEG,
    LOOKUPSWITCH,
    LOR,
    LREM,
    LRETURN,
    LSHL,
    LSHR,
    LSTORE,
    LSTORE_0,
    LSTORE_1,
    LSTORE_2,
    LSTORE_3,
    LSUB,
    LUSHR,
    LXOR,
    MONITORENTER,
    MONITOREXIT,
    MULTIANEWARRAY,
    NEW,
    NEWARRAY,
    NOP,
    POP,
    POP2,
    PUTFIELD,
    PUTSTATIC,
    RET,
    RETURN,
    SALOAD,
    SASTORE,
    SIPUSH,
    SWAP,
    TABLESWITCH,
    WIDE,

    // code table

    CODE_EXCEPTION_TABLE,
    CODE_EXCEPTION,
    LOCAL_VARIABLE_TABLE,
    LOCAL_VARIABLE,

    // common

    BOOTSTRAP_METHOD,
    INNER_CLASS,
    METHOD_HANDLE,
    METHOD_TYPE,
    PARAMETER,

    // constant

    CONSTANT_POOL,
    CONSTANT,

    CONSTANT_CLASS,
    CONSTANT_DOUBLE,
    CONSTANT_FIELD_REF,
    CONSTANT_FLOAT,
    CONSTANT_INTEGER,
    CONSTANT_INTERFACE_METHOD_REF,
    CONSTANT_INVOKE_DYNAMIC,
    CONSTANT_LONG,
    CONSTANT_METHOD_HANDLE,
    CONSTANT_METHOD_REF,
    CONSTANT_METHOD_TYPE,
    CONSTANT_NAME_AND_TYPE,
    CONSTANT_STRING,
    CONSTANT_UTF8

}