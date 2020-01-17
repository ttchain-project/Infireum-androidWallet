package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0002\b[\n\u0002\u0010\u000b\n\u0002\b.\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020/2\u0006\u00100\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020/2\u0006\u00100\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020/2\u0006\u00100\u001a\u000207H\u0016J\u0010\u00108\u001a\u00020/2\u0006\u00100\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020/2\u0006\u00100\u001a\u00020\u0013H\u0016J\u0010\u0010;\u001a\u00020/2\u0006\u00100\u001a\u00020<H\u0016J\u0010\u0010=\u001a\u00020/2\u0006\u00100\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020/2\u0006\u00100\u001a\u00020@H\u0016J\u0010\u0010A\u001a\u00020/2\u0006\u00100\u001a\u00020BH\u0016J\u0010\u0010C\u001a\u00020/2\u0006\u00100\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020/2\u0006\u00100\u001a\u00020FH\u0016J\u0010\u0010G\u001a\u00020/2\u0006\u00100\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u00020/2\u0006\u00100\u001a\u00020JH\u0016J\u0010\u0010K\u001a\u00020/2\u0006\u00100\u001a\u00020LH\u0016J\u0010\u0010M\u001a\u00020/2\u0006\u00100\u001a\u00020NH\u0016J\u0010\u0010O\u001a\u00020/2\u0006\u00100\u001a\u00020PH\u0016J\u0010\u0010Q\u001a\u00020/2\u0006\u00100\u001a\u00020RH\u0016J\b\u0010S\u001a\u00020TH\u0016J\b\u0010U\u001a\u00020TH\u0016J\b\u0010V\u001a\u00020TH\u0016J\b\u0010W\u001a\u00020TH\u0016J\b\u0010X\u001a\u00020TH\u0016J\b\u0010Y\u001a\u00020TH\u0016J\b\u0010Z\u001a\u00020TH\u0016J\b\u0010[\u001a\u00020TH\u0016J\b\u0010\\\u001a\u00020TH\u0016J\b\u0010]\u001a\u00020TH\u0016J\b\u0010^\u001a\u00020TH\u0016J\b\u0010_\u001a\u00020TH\u0016J\b\u0010`\u001a\u00020TH\u0016J\b\u0010a\u001a\u00020TH\u0016J\b\u0010b\u001a\u00020TH\u0016J\u0010\u0010c\u001a\u00020T2\u0006\u0010d\u001a\u00020/H\u0016J\u0010\u0010e\u001a\u00020T2\u0006\u0010d\u001a\u00020/H\u0016J\u0010\u0010f\u001a\u00020T2\u0006\u0010d\u001a\u00020/H\u0016J\u0010\u0010g\u001a\u00020T2\u0006\u0010d\u001a\u00020/H\u0016J\u0010\u0010h\u001a\u00020T2\u0006\u0010i\u001a\u00020/H\u0016J\u0010\u0010j\u001a\u00020T2\u0006\u0010d\u001a\u00020/H\u0016J\u0010\u0010k\u001a\u00020T2\u0006\u0010d\u001a\u00020/H\u0016J\b\u0010l\u001a\u00020TH\u0016J\u0010\u0010m\u001a\u00020T2\u0006\u0010d\u001a\u00020/H\u0016J\u0010\u0010n\u001a\u00020T2\u0006\u0010d\u001a\u00020/H\u0016J\u0010\u0010o\u001a\u00020T2\u0006\u0010d\u001a\u00020/H\u0016J\u0010\u0010p\u001a\u00020T2\u0006\u0010d\u001a\u00020/H\u0016J\u0010\u0010q\u001a\u00020T2\u0006\u0010d\u001a\u00020/H\u0016J\u0010\u0010r\u001a\u00020T2\u0006\u0010s\u001a\u00020tH\u0016J\u0010\u0010u\u001a\u00020T2\u0006\u0010d\u001a\u00020/H\u0016J\u0010\u0010v\u001a\u00020/2\u0006\u0010d\u001a\u00020/H\u0016J\u0010\u0010w\u001a\u0002012\u0006\u0010d\u001a\u00020/H\u0016J\u000e\u0010x\u001a\b\u0012\u0004\u0012\u0002010\u0012H\u0016J\u000e\u0010y\u001a\b\u0012\u0004\u0012\u00020L0\u0012H\u0016J\u0016\u0010y\u001a\b\u0012\u0004\u0012\u00020L0\u00122\u0006\u0010z\u001a\u00020/H\u0016J\u0018\u0010{\u001a\u0002032\u0006\u0010|\u001a\u00020/2\u0006\u0010}\u001a\u00020/H\u0016J\u000e\u0010~\u001a\b\u0012\u0004\u0012\u0002030\u0012H\u0016J\u001d\u0010\u007f\u001a\b\u0012\u0004\u0012\u0002030\u00122\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020/0\u0012H\u0016J\u0017\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u0002030\u00122\u0006\u0010|\u001a\u00020/H\u0016J\u001f\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u0002030\u00122\u0006\u0010|\u001a\u00020/2\u0006\u0010}\u001a\u00020/H\u0016J\u0011\u0010\u0083\u0001\u001a\u0002052\u0006\u0010s\u001a\u00020tH\u0016J\u000f\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u0002050\u0012H\u0016J\u0011\u0010\u0085\u0001\u001a\u0002072\u0006\u0010s\u001a\u00020tH\u0016J\u0012\u0010\u0086\u0001\u001a\u0002092\u0007\u0010\u0087\u0001\u001a\u00020tH\u0016J\u0017\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u0002090\u00122\u0006\u0010s\u001a\u00020tH\u0016J\u0011\u0010\u0089\u0001\u001a\u00020\u00132\u0006\u0010s\u001a\u00020tH\u0016J\u0011\u0010\u008a\u0001\u001a\u00020<2\u0006\u0010}\u001a\u00020/H\u0016J\u0012\u0010\u008b\u0001\u001a\u00020<2\u0007\u0010\u008c\u0001\u001a\u00020tH\u0016J\u000f\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020<0\u0012H\u0016J\u000f\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020<0\u0012H\u0016J\u0018\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020<0\u00122\u0007\u0010\u0090\u0001\u001a\u00020tH\u0016J!\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020<0\u00122\u0007\u0010\u0090\u0001\u001a\u00020t2\u0007\u0010\u0092\u0001\u001a\u00020tH\u0016J\u0018\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020<0\u00122\u0007\u0010\u0094\u0001\u001a\u00020/H\u0016J\u0011\u0010\u0095\u0001\u001a\u00020>2\u0006\u0010i\u001a\u00020/H\u0016J\u000f\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u0012H\u0016J\u0018\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u00122\u0007\u0010\u0098\u0001\u001a\u00020/H\u0016J\u0011\u0010\u0099\u0001\u001a\u00020@2\u0006\u0010d\u001a\u00020/H\u0016J\u001b\u0010\u009a\u0001\u001a\u00020@2\u0007\u0010\u009b\u0001\u001a\u00020/2\u0007\u0010\u009c\u0001\u001a\u00020/H\u0016J\u000f\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020@0\u0012H\u0016J\u0011\u0010\u009e\u0001\u001a\u00020B2\u0006\u0010d\u001a\u00020/H\u0016J\u001a\u0010\u009f\u0001\u001a\u00020B2\u0006\u0010}\u001a\u00020/2\u0007\u0010\u00a0\u0001\u001a\u00020/H\u0016J\u000f\u0010\u00a1\u0001\u001a\b\u0012\u0004\u0012\u00020B0\u0012H\u0016J\u0012\u0010\u00a2\u0001\u001a\u00020R2\u0007\u0010\u00a3\u0001\u001a\u00020/H\u0016J\u000f\u0010\u00a4\u0001\u001a\b\u0012\u0004\u0012\u00020R0\u0012H\u0016J\t\u0010\u00a5\u0001\u001a\u00020RH\u0016J\u0011\u0010\u00a6\u0001\u001a\u00020D2\u0006\u0010d\u001a\u00020/H\u0016J\u0012\u0010\u00a7\u0001\u001a\u00020D2\u0007\u0010\u00a0\u0001\u001a\u00020/H\u0016J\u0012\u0010\u00a8\u0001\u001a\u00020D2\u0007\u0010\u00a9\u0001\u001a\u00020tH\u0016J\u000f\u0010\u00aa\u0001\u001a\b\u0012\u0004\u0012\u00020D0\u0012H\u0016J\u0011\u0010\u00ab\u0001\u001a\u00020F2\u0006\u0010d\u001a\u00020/H\u0016J\u001b\u0010\u00ac\u0001\u001a\u00020F2\u0007\u0010\u00ad\u0001\u001a\u00020/2\u0007\u0010\u00ae\u0001\u001a\u00020/H\u0016J\u000f\u0010\u00af\u0001\u001a\b\u0012\u0004\u0012\u00020F0\u0012H\u0016J\u0013\u0010\u00b0\u0001\u001a\u0004\u0018\u00010H2\u0006\u0010d\u001a\u00020/H\u0016J\u000f\u0010\u00b1\u0001\u001a\b\u0012\u0004\u0012\u00020H0\u0012H\u0016J\u000f\u0010\u00b2\u0001\u001a\b\u0012\u0004\u0012\u00020R0\u0012H\u0016J\u0018\u0010\u00b3\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u00122\u0007\u0010\u0098\u0001\u001a\u00020/H\u0016J\u0011\u0010\u00b4\u0001\u001a\u00020J2\u0006\u0010d\u001a\u00020/H\u0016J\u000f\u0010\u00b5\u0001\u001a\b\u0012\u0004\u0012\u00020J0\u0012H\u0016J\u0012\u0010\u00b6\u0001\u001a\u00020N2\u0007\u0010\u00b7\u0001\u001a\u00020tH\u0016J\u0012\u0010\u00b8\u0001\u001a\u00020P2\u0007\u0010\u00b7\u0001\u001a\u00020tH\u0016J\u0013\u0010\u00b9\u0001\u001a\u0004\u0018\u00010L2\u0006\u0010d\u001a\u00020/H\u0016J\u0012\u0010\u00ba\u0001\u001a\u00020L2\u0007\u0010\u00bb\u0001\u001a\u00020tH\u0016J\u0018\u0010\u00bc\u0001\u001a\b\u0012\u0004\u0012\u00020L0\u00122\u0007\u0010\u00bd\u0001\u001a\u00020/H\u0016J\u0018\u0010\u00be\u0001\u001a\b\u0012\u0004\u0012\u00020L0\u00122\u0007\u0010\u00b7\u0001\u001a\u00020tH\u0016J\u0013\u0010\u00bf\u0001\u001a\u0004\u0018\u00010N2\u0006\u0010d\u001a\u00020/H\u0016J\u0012\u0010\u00c0\u0001\u001a\u00020N2\u0007\u0010\u00bb\u0001\u001a\u00020tH\u0016J\u000f\u0010\u00c1\u0001\u001a\b\u0012\u0004\u0012\u00020N0\u0012H\u0016J\u0018\u0010\u00c2\u0001\u001a\b\u0012\u0004\u0012\u00020N0\u00122\u0007\u0010\u00b7\u0001\u001a\u00020tH\u0016J\u0017\u0010\u00c3\u0001\u001a\b\u0012\u0004\u0012\u00020N0\u00122\u0006\u0010}\u001a\u00020/H\u0016J)\u0010\u00c4\u0001\u001a\b\u0012\u0004\u0012\u00020N0\u00122\u0007\u0010\u00c5\u0001\u001a\u00020t2\u0006\u0010}\u001a\u00020/2\u0007\u0010\u00c6\u0001\u001a\u00020/H\u0016J1\u0010\u00c4\u0001\u001a\b\u0012\u0004\u0012\u00020N0\u00122\u0007\u0010\u00c5\u0001\u001a\u00020t2\u0006\u0010}\u001a\u00020/2\u0007\u0010\u00c6\u0001\u001a\u00020/2\u0006\u0010z\u001a\u00020/H\u0016J\u0012\u0010\u00c7\u0001\u001a\u00020P2\u0007\u0010\u00bb\u0001\u001a\u00020tH\u0016J1\u0010\u00c8\u0001\u001a\b\u0012\u0004\u0012\u00020P0\u00122\u0007\u0010\u00c5\u0001\u001a\u00020t2\u0006\u0010}\u001a\u00020/2\u0007\u0010\u00c6\u0001\u001a\u00020/2\u0006\u0010z\u001a\u00020/H\u0016J\u0011\u0010\u00c9\u0001\u001a\u00020R2\u0006\u0010i\u001a\u00020/H\u0016J\u0012\u0010\u00ca\u0001\u001a\u00020R2\u0007\u0010\u00b7\u0001\u001a\u00020tH\u0016J\u000f\u0010\u00cb\u0001\u001a\b\u0012\u0004\u0012\u00020R0\u0012H\u0016J\u0018\u0010\u00cc\u0001\u001a\b\u0012\u0004\u0012\u00020R0\u00122\u0007\u0010\u00cd\u0001\u001a\u00020/H\u0016J\u0012\u0010\u00ce\u0001\u001a\u00020/2\u0007\u0010\u00cd\u0001\u001a\u00020/H\u0016J\n\u0010\u00cf\u0001\u001a\u00030\u00d0\u0001H\u0016J\n\u0010\u00d1\u0001\u001a\u00030\u00d0\u0001H\u0016J\n\u0010\u00d2\u0001\u001a\u00030\u00d0\u0001H\u0016J\n\u0010\u00d3\u0001\u001a\u00030\u00d0\u0001H\u0016J\n\u0010\u00d4\u0001\u001a\u00030\u00d0\u0001H\u0016J\n\u0010\u00d5\u0001\u001a\u00030\u00d0\u0001H\u0016J\n\u0010\u00d6\u0001\u001a\u00030\u00d0\u0001H\u0016J\n\u0010\u00d7\u0001\u001a\u00030\u00d0\u0001H\u0016J\n\u0010\u00d8\u0001\u001a\u00030\u00d0\u0001H\u0016J\n\u0010\u00d9\u0001\u001a\u00030\u00d0\u0001H\u0016J\n\u0010\u00da\u0001\u001a\u00030\u00d0\u0001H\u0016J\n\u0010\u00db\u0001\u001a\u00030\u00d0\u0001H\u0016J\n\u0010\u00dc\u0001\u001a\u00030\u00d0\u0001H\u0016J\n\u0010\u00dd\u0001\u001a\u00030\u00d0\u0001H\u0016J\u0018\u0010\u00de\u0001\u001a\u00020T2\r\u0010\u00df\u0001\u001a\b\u0012\u0004\u0012\u0002010\u0012H\u0016J\u0018\u0010\u00e0\u0001\u001a\u00020T2\r\u0010\u00df\u0001\u001a\b\u0012\u0004\u0012\u0002030\u0012H\u0016J\u0018\u0010\u00e1\u0001\u001a\u00020T2\r\u0010\u00df\u0001\u001a\b\u0012\u0004\u0012\u00020<0\u0012H\u0016J\u0018\u0010\u00e2\u0001\u001a\u00020T2\r\u0010\u00df\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u0012H\u0016J\u0018\u0010\u00e3\u0001\u001a\u00020T2\r\u0010\u00df\u0001\u001a\b\u0012\u0004\u0012\u00020@0\u0012H\u0016J\u0018\u0010\u00e4\u0001\u001a\u00020T2\r\u0010\u00df\u0001\u001a\b\u0012\u0004\u0012\u00020B0\u0012H\u0016J\u0018\u0010\u00e5\u0001\u001a\u00020T2\r\u0010\u00df\u0001\u001a\b\u0012\u0004\u0012\u00020D0\u0012H\u0016J\u0018\u0010\u00e6\u0001\u001a\u00020T2\r\u0010\u00df\u0001\u001a\b\u0012\u0004\u0012\u00020F0\u0012H\u0016J\u0018\u0010\u00e7\u0001\u001a\u00020T2\r\u0010\u00df\u0001\u001a\b\u0012\u0004\u0012\u00020H0\u0012H\u0016J\u0018\u0010\u00e8\u0001\u001a\u00020T2\r\u0010\u00df\u0001\u001a\b\u0012\u0004\u0012\u00020J0\u0012H\u0016J\u0018\u0010\u00e9\u0001\u001a\u00020T2\r\u0010\u00df\u0001\u001a\b\u0012\u0004\u0012\u00020L0\u0012H\u0016J\u0018\u0010\u00ea\u0001\u001a\u00020T2\r\u0010\u00df\u0001\u001a\b\u0012\u0004\u0012\u00020N0\u0012H\u0016J\u0018\u0010\u00eb\u0001\u001a\u00020T2\r\u0010\u00df\u0001\u001a\b\u0012\u0004\u0012\u00020R0\u0012H\u0016J\u0011\u0010\u00ec\u0001\u001a\u00020T2\u0006\u00100\u001a\u000201H\u0016J\u0011\u0010\u00ed\u0001\u001a\u00020T2\u0006\u00100\u001a\u000203H\u0016J\u0011\u0010\u00ee\u0001\u001a\u00020T2\u0006\u00100\u001a\u000205H\u0016J\u0011\u0010\u00ef\u0001\u001a\u00020T2\u0006\u00100\u001a\u000207H\u0016J\u0011\u0010\u00f0\u0001\u001a\u00020T2\u0006\u00100\u001a\u000209H\u0016J\u0011\u0010\u00f1\u0001\u001a\u00020T2\u0006\u00100\u001a\u00020\u0013H\u0016J\u0011\u0010\u00f2\u0001\u001a\u00020T2\u0006\u00100\u001a\u00020<H\u0016J\u0011\u0010\u00f3\u0001\u001a\u00020T2\u0006\u00100\u001a\u00020>H\u0016J\u0011\u0010\u00f4\u0001\u001a\u00020T2\u0006\u00100\u001a\u00020@H\u0016J\u0011\u0010\u00f5\u0001\u001a\u00020T2\u0006\u00100\u001a\u00020BH\u0016J\u0011\u0010\u00f6\u0001\u001a\u00020T2\u0006\u00100\u001a\u00020DH\u0016J\u0011\u0010\u00f7\u0001\u001a\u00020T2\u0006\u00100\u001a\u00020FH\u0016J\u0011\u0010\u00f8\u0001\u001a\u00020T2\u0006\u00100\u001a\u00020HH\u0016J\u0011\u0010\u00f9\u0001\u001a\u00020T2\u0006\u00100\u001a\u00020JH\u0016J\u0011\u0010\u00fa\u0001\u001a\u00020T2\u0006\u00100\u001a\u00020LH\u0016J\u0011\u0010\u00fb\u0001\u001a\u00020T2\u0006\u00100\u001a\u00020NH\u0016J\u0011\u0010\u00fc\u0001\u001a\u00020T2\u0006\u00100\u001a\u00020PH\u0016J\u0011\u0010\u00fd\u0001\u001a\u00020/2\u0006\u00100\u001a\u00020RH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00fe\u0001"}, d2 = {"Lcom/ttchain/walletproject/model/DbHelperImpl;", "Lcom/ttchain/walletproject/model/DbHelper;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "addressDao", "Lcom/ttchain/walletproject/database/AddressDao;", "assetDao", "Lcom/ttchain/walletproject/database/AssetDao;", "chatCommunicationDao", "Lcom/ttchain/walletproject/database/ChatCommunicationDao;", "chatGroupDao", "Lcom/ttchain/walletproject/database/ChatGroupDao;", "chatMessageDao", "Lcom/ttchain/walletproject/database/ChatMessageDao;", "chatRoomDao", "Lcom/ttchain/walletproject/database/ChatRoomDao;", "chatRoomDataList", "", "Lcom/ttchain/walletproject/database/data/ChatRoomData;", "getChatRoomDataList", "()Ljava/util/List;", "coinDao", "Lcom/ttchain/walletproject/database/CoinDao;", "coinSelectionDao", "Lcom/ttchain/walletproject/database/CoinSelectionDao;", "coinToCoinRateDao", "Lcom/ttchain/walletproject/database/CoinToCoinRateDao;", "coinToFiatRateDao", "Lcom/ttchain/walletproject/database/CoinToFiatRateDao;", "fiatDao", "Lcom/ttchain/walletproject/database/FiatDao;", "fiatToFiatRateDao", "Lcom/ttchain/walletproject/database/FiatToFiatRateDao;", "identityDao", "Lcom/ttchain/walletproject/database/IdentityDao;", "languageDao", "Lcom/ttchain/walletproject/database/LanguageDao;", "lightningTransRecordDao", "Lcom/ttchain/walletproject/database/LightningTransRecordDao;", "transRecordDao", "Lcom/ttchain/walletproject/database/TransRecordDao;", "usdtTransRecordDao", "Lcom/ttchain/walletproject/database/UsdtTransRecordDao;", "wallDao", "Lcom/ttchain/walletproject/database/WalletDao;", "addAddressData", "", "data", "Lcom/ttchain/walletproject/database/data/AddressData;", "addAssetData", "Lcom/ttchain/walletproject/database/data/AssetData;", "addChatCommunicationData", "Lcom/ttchain/walletproject/database/data/ChatCommunicationData;", "addChatGroupData", "Lcom/ttchain/walletproject/database/data/ChatGroupData;", "addChatMessageData", "Lcom/ttchain/walletproject/database/data/ChatMessageData;", "addChatRoomData", "addCoinData", "Lcom/ttchain/walletproject/database/data/CoinData;", "addCoinSelectionData", "Lcom/ttchain/walletproject/database/data/CoinSelectionData;", "addCoinToCoinRateData", "Lcom/ttchain/walletproject/database/data/CoinToCoinRateData;", "addCoinToFiatRateData", "Lcom/ttchain/walletproject/database/data/CoinToFiatRateData;", "addFiatData", "Lcom/ttchain/walletproject/database/data/FiatData;", "addFiatToFiatRateData", "Lcom/ttchain/walletproject/database/data/FiatToFiatRateData;", "addIdentityData", "Lcom/ttchain/walletproject/database/data/IdentityData;", "addLanguageData", "Lcom/ttchain/walletproject/database/data/LanguageData;", "addLightningTransRecordData", "Lcom/ttchain/walletproject/database/data/LightningTransRecordData;", "addTransRecordData", "Lcom/ttchain/walletproject/database/data/TransRecordData;", "addUsdtTransRecordData", "Lcom/ttchain/walletproject/database/data/UsdtTransRecordData;", "addWalletData", "Lcom/ttchain/walletproject/database/data/WalletData;", "clearAddressDataTable", "", "clearAllTableData", "clearAssetDataTable", "clearCoinDataTable", "clearCoinSelectionDataTable", "clearCoinToCoinRateDataTable", "clearCoinToFiatRateDataTable", "clearFiatDataTable", "clearFiatToFiatRateDataTable", "clearIdentityDataTable", "clearLanguageDataTable", "clearLightningTransRecordDataTable", "clearTransRecordDataTable", "clearUserIdentityRelativeTables", "clearWalletDataTable", "deleteAddressData", "_id", "deleteAssetData", "deleteChatCommunicationData", "deleteCoinData", "deleteCoinSelectionData", "id", "deleteCoinToCoinRateData", "deleteCoinToFiatRateData", "deleteDb", "deleteFiatData", "deleteFiatToFiatRateData", "deleteIdentityData", "deleteLanguageData", "deleteLightningTransRecordData", "deleteMsgByRoomId", "roomId", "", "deleteTransRecordData", "deleteWalletData", "getAddressData", "getAddressDataList", "getAllLightningTransRecordDataList", "page", "getAssetDataByWalletIDAndCoinID", "walletID", "coinID", "getAssetDataList", "getAssetDataListByCoinIDs", "coinIds", "getAssetDataListByWalletID", "getAssetDataListByWalletIDAndCoinID", "getChatCommunicationByRoomId", "getChatCommunicationDataList", "getChatGroupDataByRoomId", "getChatMessageDataByMsgId", "msgId", "getChatMessageDataListByRoomId", "getChatRoomDataByRoomId", "getCoinData", "getCoinDataByCoinId", "coinId", "getCoinDataList", "getCoinDataListByDefaultIsDefaultSelected", "getCoinDataListByMainCoinId", "mainCoinId", "getCoinDataListByMainCoinIdAndWord", "word", "getCoinDataListByWalletTypeId", "typeId", "getCoinSelectionData", "getCoinSelectionDataList", "getCoinSelectionDataListByWalletID", "walletId", "getCoinToCoinRateData", "getCoinToCoinRateDataByCoinID", "fromCoinId", "toCoinId", "getCoinToCoinRateDataList", "getCoinToFiatRateData", "getCoinToFiatRateDataFromCoinIDToFiatId", "fiatId", "getCoinToFiatRateDataList", "getDefaultSelectedWalletDataByIdentityID", "identityID", "getDefaultWalletDataList", "getDefaultWalletTypeWalletData", "getFiatData", "getFiatDataByFiatId", "getFiatDataByName", "name", "getFiatDataList", "getFiatToFiatRateData", "getFiatToFiatRateDataByFromFiatIDToFiatID", "fromFiatID", "toFiatID", "getFiatToFiatRateDataList", "getIdentityData", "getIdentityDataList", "getImportWalletDataList", "getIsSelectedCoinSelectionDataListByWalletID", "getLanguageData", "getLanguageDataList", "getLatestTransRecordDataByAddress", "address", "getLatestUsdtTransRecordDataByAddress", "getLightningTransRecordData", "getLightningTransRecordDataByTxId", "txId", "getLightningTransRecordDataList", "coin_Id", "getLightningTransRecordDataListByAddress", "getTransRecordData", "getTransRecordDataByTxId", "getTransRecordDataList", "getTransRecordDataListByAddress", "getTransRecordDataListByCoinID", "getTransRecordDataListByCondition", "walletAddress", "state", "getUsdtTransRecordDataByTxId", "getUsdtTransRecordDataListByCondition", "getWalletData", "getWalletDataByAddress", "getWalletDataList", "getWalletDataListByWalletType", "walletType", "getWalletDataListCountByWalletType", "isAddressDataEmpty", "", "isAssetDataEmpty", "isCoinDataEmpty", "isCoinSelectionDataEmpty", "isCoinToCoinRateDataEmpty", "isCoinToFiatRateDataEmpty", "isExistDb", "isFiatDataEmpty", "isFiatToFiatRateDataEmpty", "isIdentityDataEmpty", "isLanguageDataEmpty", "isLightningTransRecordDataEmpty", "isTransRecordDataEmpty", "isWalletDataEmpty", "setAddressDataList", "list", "setAssetDataList", "setCoinDataList", "setCoinSelectionDataList", "setCoinToCoinRateDataList", "setCoinToFiatRateDataList", "setFiatDataList", "setFiatToFiatRateDataList", "setIdentityDataList", "setLanguageDataList", "setLightningTransRecordDataList", "setTransRecordDataList", "setWalletDataList", "updateAddressData", "updateAssetData", "updateChatCommunicationData", "updateChatGroupData", "updateChatMessageData", "updateChatRoomData", "updateCoinData", "updateCoinSelectionData", "updateCoinToCoinRateData", "updateCoinToFiatRateData", "updateFiatData", "updateFiatToFiatRateData", "updateIdentityData", "updateLanguageData", "updateLightningTransRecordData", "updateTransRecordData", "updateUsdtTransRecordData", "updateWalletData", "app_proPlayDebug"})
public final class DbHelperImpl implements com.ttchain.walletproject.model.DbHelper {
    private final com.ttchain.walletproject.database.IdentityDao identityDao = null;
    private final com.ttchain.walletproject.database.CoinDao coinDao = null;
    private final com.ttchain.walletproject.database.WalletDao wallDao = null;
    private final com.ttchain.walletproject.database.CoinSelectionDao coinSelectionDao = null;
    private final com.ttchain.walletproject.database.AssetDao assetDao = null;
    private final com.ttchain.walletproject.database.AddressDao addressDao = null;
    private final com.ttchain.walletproject.database.LanguageDao languageDao = null;
    private final com.ttchain.walletproject.database.FiatDao fiatDao = null;
    private final com.ttchain.walletproject.database.CoinToCoinRateDao coinToCoinRateDao = null;
    private final com.ttchain.walletproject.database.CoinToFiatRateDao coinToFiatRateDao = null;
    private final com.ttchain.walletproject.database.FiatToFiatRateDao fiatToFiatRateDao = null;
    private final com.ttchain.walletproject.database.TransRecordDao transRecordDao = null;
    private final com.ttchain.walletproject.database.LightningTransRecordDao lightningTransRecordDao = null;
    private final com.ttchain.walletproject.database.UsdtTransRecordDao usdtTransRecordDao = null;
    private final com.ttchain.walletproject.database.ChatRoomDao chatRoomDao = null;
    private final com.ttchain.walletproject.database.ChatMessageDao chatMessageDao = null;
    private final com.ttchain.walletproject.database.ChatCommunicationDao chatCommunicationDao = null;
    private final com.ttchain.walletproject.database.ChatGroupDao chatGroupDao = null;
    private final android.content.Context mContext = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.ChatRoomData> getChatRoomDataList() {
        return null;
    }
    
    @java.lang.Override()
    public void deleteDb() {
    }
    
    @java.lang.Override()
    public boolean isExistDb() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isCoinDataEmpty() {
        return false;
    }
    
    @java.lang.Override()
    public int addCoinData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinData data) {
        return 0;
    }
    
    @java.lang.Override()
    public void updateCoinData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinData data) {
    }
    
    @java.lang.Override()
    public void deleteCoinData(int _id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.CoinData> getCoinDataListByWalletTypeId(int typeId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.CoinData> getCoinDataListByDefaultIsDefaultSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.CoinData> getCoinDataListByMainCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String mainCoinId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.CoinData> getCoinDataListByMainCoinIdAndWord(@org.jetbrains.annotations.NotNull()
    java.lang.String mainCoinId, @org.jetbrains.annotations.NotNull()
    java.lang.String word) {
        return null;
    }
    
    @java.lang.Override()
    public void setCoinDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.CoinData> list) {
    }
    
    @java.lang.Override()
    public boolean isWalletDataEmpty() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.WalletData> getWalletDataList() {
        return null;
    }
    
    @java.lang.Override()
    public void setWalletDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.WalletData> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.WalletData getDefaultWalletTypeWalletData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.WalletData getDefaultSelectedWalletDataByIdentityID(int identityID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.WalletData getWalletDataByAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.WalletData getWalletData(int id) {
        return null;
    }
    
    @java.lang.Override()
    public void clearAllTableData() {
    }
    
    @java.lang.Override()
    public void clearUserIdentityRelativeTables() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.WalletData> getDefaultWalletDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.WalletData> getImportWalletDataList() {
        return null;
    }
    
    @java.lang.Override()
    public int updateWalletData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.WalletData data) {
        return 0;
    }
    
    @java.lang.Override()
    public int addCoinSelectionData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinSelectionData data) {
        return 0;
    }
    
    @java.lang.Override()
    public boolean isCoinSelectionDataEmpty() {
        return false;
    }
    
    @java.lang.Override()
    public void clearCoinSelectionDataTable() {
    }
    
    @java.lang.Override()
    public void setCoinSelectionDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.CoinSelectionData> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.CoinSelectionData> getCoinSelectionDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.CoinSelectionData> getCoinSelectionDataListByWalletID(int walletId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.CoinSelectionData> getIsSelectedCoinSelectionDataListByWalletID(int walletId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.CoinSelectionData getCoinSelectionData(int id) {
        return null;
    }
    
    @java.lang.Override()
    public void updateCoinSelectionData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinSelectionData data) {
    }
    
    @java.lang.Override()
    public void deleteCoinSelectionData(int id) {
    }
    
    @java.lang.Override()
    public boolean isAssetDataEmpty() {
        return false;
    }
    
    @java.lang.Override()
    public void setAssetDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.AssetData> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.AssetData> getAssetDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.CoinData getCoinData(int coinID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.CoinData getCoinDataByCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
        return null;
    }
    
    @java.lang.Override()
    public int addAssetData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.AssetData data) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.AssetData> getAssetDataListByWalletID(int walletID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.AssetData getAssetDataByWalletIDAndCoinID(int walletID, int coinID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.AssetData> getAssetDataListByCoinIDs(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> coinIds) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.AssetData> getAssetDataListByWalletIDAndCoinID(int walletID, int coinID) {
        return null;
    }
    
    @java.lang.Override()
    public void deleteAssetData(int _id) {
    }
    
    @java.lang.Override()
    public boolean isAddressDataEmpty() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isIdentityDataEmpty() {
        return false;
    }
    
    @java.lang.Override()
    public int addAddressData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.AddressData data) {
        return 0;
    }
    
    @java.lang.Override()
    public void updateAssetData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.AssetData data) {
    }
    
    @java.lang.Override()
    public int addIdentityData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.IdentityData data) {
        return 0;
    }
    
    @java.lang.Override()
    public void updateIdentityData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.IdentityData data) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.IdentityData getIdentityData(int _id) {
        return null;
    }
    
    @java.lang.Override()
    public void setIdentityDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.IdentityData> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.IdentityData> getIdentityDataList() {
        return null;
    }
    
    @java.lang.Override()
    public void deleteIdentityData(int _id) {
    }
    
    @java.lang.Override()
    public void updateAddressData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.AddressData data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.AddressData getAddressData(int _id) {
        return null;
    }
    
    @java.lang.Override()
    public void setAddressDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.AddressData> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.AddressData> getAddressDataList() {
        return null;
    }
    
    @java.lang.Override()
    public void deleteAddressData(int _id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.CoinData> getCoinDataList() {
        return null;
    }
    
    @java.lang.Override()
    public int addCoinToCoinRateData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinToCoinRateData data) {
        return 0;
    }
    
    @java.lang.Override()
    public boolean isFiatDataEmpty() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isLanguageDataEmpty() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isCoinToCoinRateDataEmpty() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isCoinToFiatRateDataEmpty() {
        return false;
    }
    
    @java.lang.Override()
    public void clearCoinToFiatRateDataTable() {
    }
    
    @java.lang.Override()
    public boolean isFiatToFiatRateDataEmpty() {
        return false;
    }
    
    @java.lang.Override()
    public void clearFiatToFiatRateDataTable() {
    }
    
    @java.lang.Override()
    public int addFiatData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.FiatData data) {
        return 0;
    }
    
    @java.lang.Override()
    public void updateFiatData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.FiatData data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.FiatData getFiatData(int _id) {
        return null;
    }
    
    @java.lang.Override()
    public void setFiatDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.FiatData> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.FiatData> getFiatDataList() {
        return null;
    }
    
    @java.lang.Override()
    public void deleteFiatData(int _id) {
    }
    
    @java.lang.Override()
    public int addLanguageData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.LanguageData data) {
        return 0;
    }
    
    @java.lang.Override()
    public void updateLanguageData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.LanguageData data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.LanguageData getLanguageData(int _id) {
        return null;
    }
    
    @java.lang.Override()
    public void setLanguageDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.LanguageData> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.LanguageData> getLanguageDataList() {
        return null;
    }
    
    @java.lang.Override()
    public void deleteLanguageData(int _id) {
    }
    
    @java.lang.Override()
    public void updateCoinToCoinRateData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinToCoinRateData data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.CoinToCoinRateData getCoinToCoinRateData(int _id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.CoinToCoinRateData getCoinToCoinRateDataByCoinID(int fromCoinId, int toCoinId) {
        return null;
    }
    
    @java.lang.Override()
    public void setCoinToCoinRateDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.CoinToCoinRateData> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.CoinToCoinRateData> getCoinToCoinRateDataList() {
        return null;
    }
    
    @java.lang.Override()
    public void deleteCoinToCoinRateData(int _id) {
    }
    
    @java.lang.Override()
    public int addCoinToFiatRateData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinToFiatRateData data) {
        return 0;
    }
    
    @java.lang.Override()
    public void updateCoinToFiatRateData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinToFiatRateData data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.CoinToFiatRateData getCoinToFiatRateData(int _id) {
        return null;
    }
    
    @java.lang.Override()
    public void setCoinToFiatRateDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.CoinToFiatRateData> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.CoinToFiatRateData> getCoinToFiatRateDataList() {
        return null;
    }
    
    @java.lang.Override()
    public void deleteCoinToFiatRateData(int _id) {
    }
    
    @java.lang.Override()
    public int addFiatToFiatRateData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.FiatToFiatRateData data) {
        return 0;
    }
    
    @java.lang.Override()
    public void updateFiatToFiatRateData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.FiatToFiatRateData data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.FiatToFiatRateData getFiatToFiatRateData(int _id) {
        return null;
    }
    
    @java.lang.Override()
    public void setFiatToFiatRateDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.FiatToFiatRateData> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.FiatToFiatRateData> getFiatToFiatRateDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.FiatToFiatRateData getFiatToFiatRateDataByFromFiatIDToFiatID(int fromFiatID, int toFiatID) {
        return null;
    }
    
    @java.lang.Override()
    public void deleteFiatToFiatRateData(int _id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.CoinToFiatRateData getCoinToFiatRateDataFromCoinIDToFiatId(int coinID, int fiatId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.FiatData getFiatDataByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.FiatData getFiatDataByFiatId(int fiatId) {
        return null;
    }
    
    @java.lang.Override()
    public int addWalletData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.WalletData data) {
        return 0;
    }
    
    @java.lang.Override()
    public int deleteWalletData(int _id) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.WalletData> getWalletDataListByWalletType(int walletType) {
        return null;
    }
    
    @java.lang.Override()
    public int getWalletDataListCountByWalletType(int walletType) {
        return 0;
    }
    
    @java.lang.Override()
    public boolean isTransRecordDataEmpty() {
        return false;
    }
    
    @java.lang.Override()
    public void setTransRecordDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.TransRecordData> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.TransRecordData> getTransRecordDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.TransRecordData> getTransRecordDataListByCoinID(int coinID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.TransRecordData> getTransRecordDataListByCondition(@org.jetbrains.annotations.NotNull()
    java.lang.String walletAddress, int coinID, int state) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.TransRecordData> getTransRecordDataListByCondition(@org.jetbrains.annotations.NotNull()
    java.lang.String walletAddress, int coinID, int state, int page) {
        return null;
    }
    
    @java.lang.Override()
    public boolean isLightningTransRecordDataEmpty() {
        return false;
    }
    
    @java.lang.Override()
    public void setLightningTransRecordDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.LightningTransRecordData> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.LightningTransRecordData> getLightningTransRecordDataList(int coin_Id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.LightningTransRecordData> getLightningTransRecordDataListByAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.LightningTransRecordData> getAllLightningTransRecordDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.LightningTransRecordData> getAllLightningTransRecordDataList(int page) {
        return null;
    }
    
    @java.lang.Override()
    public void clearAddressDataTable() {
    }
    
    @java.lang.Override()
    public void clearIdentityDataTable() {
    }
    
    @java.lang.Override()
    public void clearCoinDataTable() {
    }
    
    @java.lang.Override()
    public void clearWalletDataTable() {
    }
    
    @java.lang.Override()
    public void clearAssetDataTable() {
    }
    
    @java.lang.Override()
    public void clearFiatDataTable() {
    }
    
    @java.lang.Override()
    public void clearLanguageDataTable() {
    }
    
    @java.lang.Override()
    public void clearCoinToCoinRateDataTable() {
    }
    
    @java.lang.Override()
    public void clearTransRecordDataTable() {
    }
    
    @java.lang.Override()
    public void deleteLightningTransRecordData(int _id) {
    }
    
    @java.lang.Override()
    public void deleteTransRecordData(int _id) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.LightningTransRecordData getLightningTransRecordData(int _id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.TransRecordData getTransRecordData(int _id) {
        return null;
    }
    
    @java.lang.Override()
    public void updateLightningTransRecordData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.LightningTransRecordData data) {
    }
    
    @java.lang.Override()
    public void updateTransRecordData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.TransRecordData data) {
    }
    
    @java.lang.Override()
    public void clearLightningTransRecordDataTable() {
    }
    
    @java.lang.Override()
    public int addLightningTransRecordData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.LightningTransRecordData data) {
        return 0;
    }
    
    @java.lang.Override()
    public int addTransRecordData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.TransRecordData data) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.LightningTransRecordData getLightningTransRecordDataByTxId(@org.jetbrains.annotations.NotNull()
    java.lang.String txId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.TransRecordData getTransRecordDataByTxId(@org.jetbrains.annotations.NotNull()
    java.lang.String txId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.TransRecordData> getTransRecordDataListByAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.TransRecordData getLatestTransRecordDataByAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.UsdtTransRecordData getUsdtTransRecordDataByTxId(@org.jetbrains.annotations.NotNull()
    java.lang.String txId) {
        return null;
    }
    
    @java.lang.Override()
    public int addUsdtTransRecordData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.UsdtTransRecordData data) {
        return 0;
    }
    
    @java.lang.Override()
    public void updateUsdtTransRecordData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.UsdtTransRecordData data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.UsdtTransRecordData> getUsdtTransRecordDataListByCondition(@org.jetbrains.annotations.NotNull()
    java.lang.String walletAddress, int coinID, int state, int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.UsdtTransRecordData getLatestUsdtTransRecordDataByAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @java.lang.Override()
    public int addChatRoomData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.ChatRoomData data) {
        return 0;
    }
    
    @java.lang.Override()
    public void updateChatRoomData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.ChatRoomData data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.ChatRoomData getChatRoomDataByRoomId(@org.jetbrains.annotations.NotNull()
    java.lang.String roomId) {
        return null;
    }
    
    @java.lang.Override()
    public int addChatMessageData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.ChatMessageData data) {
        return 0;
    }
    
    @java.lang.Override()
    public void updateChatMessageData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.ChatMessageData data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.ChatMessageData getChatMessageDataByMsgId(@org.jetbrains.annotations.NotNull()
    java.lang.String msgId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.ChatMessageData> getChatMessageDataListByRoomId(@org.jetbrains.annotations.NotNull()
    java.lang.String roomId) {
        return null;
    }
    
    @java.lang.Override()
    public void deleteMsgByRoomId(@org.jetbrains.annotations.NotNull()
    java.lang.String roomId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.ChatCommunicationData> getChatCommunicationDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.ChatCommunicationData getChatCommunicationByRoomId(@org.jetbrains.annotations.NotNull()
    java.lang.String roomId) {
        return null;
    }
    
    @java.lang.Override()
    public void updateChatCommunicationData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.ChatCommunicationData data) {
    }
    
    @java.lang.Override()
    public int addChatCommunicationData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.ChatCommunicationData data) {
        return 0;
    }
    
    @java.lang.Override()
    public void deleteChatCommunicationData(int _id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.database.data.ChatGroupData getChatGroupDataByRoomId(@org.jetbrains.annotations.NotNull()
    java.lang.String roomId) {
        return null;
    }
    
    @java.lang.Override()
    public void updateChatGroupData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.ChatGroupData data) {
    }
    
    @java.lang.Override()
    public int addChatGroupData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.ChatGroupData data) {
        return 0;
    }
    
    public DbHelperImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
}