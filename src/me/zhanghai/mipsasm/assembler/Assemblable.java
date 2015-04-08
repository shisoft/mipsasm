/*
 * Copyright (c) 2015 Zhang Hai <Dreaming.in.Code.ZH@Gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.mipsasm.assembler;

public interface Assemblable {

    void locate(AssemblyContext context);

    void assemble(AssemblyContext context) throws AssemblerException;
}
