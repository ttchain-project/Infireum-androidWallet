package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\bV\n\u0002\u0010\u000b\n\u0002\b.\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u001bH&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u001dH&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u001fH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020!H&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020#H&J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020%H&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\'H&J\b\u0010(\u001a\u00020)H&J\b\u0010*\u001a\u00020)H&J\b\u0010+\u001a\u00020)H&J\b\u0010,\u001a\u00020)H&J\b\u0010-\u001a\u00020)H&J\b\u0010.\u001a\u00020)H&J\b\u0010/\u001a\u00020)H&J\b\u00100\u001a\u00020)H&J\b\u00101\u001a\u00020)H&J\b\u00102\u001a\u00020)H&J\b\u00103\u001a\u00020)H&J\b\u00104\u001a\u00020)H&J\b\u00105\u001a\u00020)H&J\b\u00106\u001a\u00020)H&J\b\u00107\u001a\u00020)H&J\u0010\u00108\u001a\u00020)2\u0006\u00109\u001a\u00020\u0003H&J\u0010\u0010:\u001a\u00020)2\u0006\u00109\u001a\u00020\u0003H&J\u0010\u0010;\u001a\u00020)2\u0006\u00109\u001a\u00020\u0003H&J\u0010\u0010<\u001a\u00020)2\u0006\u00109\u001a\u00020\u0003H&J\u0010\u0010=\u001a\u00020)2\u0006\u00109\u001a\u00020\u0003H&J\u0010\u0010>\u001a\u00020)2\u0006\u00109\u001a\u00020\u0003H&J\u0010\u0010?\u001a\u00020)2\u0006\u00109\u001a\u00020\u0003H&J\b\u0010@\u001a\u00020)H&J\u0010\u0010A\u001a\u00020)2\u0006\u00109\u001a\u00020\u0003H&J\u0010\u0010B\u001a\u00020)2\u0006\u00109\u001a\u00020\u0003H&J\u0010\u0010C\u001a\u00020)2\u0006\u00109\u001a\u00020\u0003H&J\u0010\u0010D\u001a\u00020)2\u0006\u00109\u001a\u00020\u0003H&J\u0010\u0010E\u001a\u00020)2\u0006\u00109\u001a\u00020\u0003H&J\u0010\u0010F\u001a\u00020)2\u0006\u0010G\u001a\u00020HH&J\u0010\u0010I\u001a\u00020)2\u0006\u00109\u001a\u00020\u0003H&J\u0010\u0010J\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u0003H&J\u0010\u0010K\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u0003H&J\u000e\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00050MH&J\u000e\u0010N\u001a\b\u0012\u0004\u0012\u00020!0MH&J\u0016\u0010N\u001a\b\u0012\u0004\u0012\u00020!0M2\u0006\u0010O\u001a\u00020\u0003H&J\u0018\u0010P\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010R\u001a\u00020\u0003H&J\u000e\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00070MH&J\u001c\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00070M2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00030MH&J\u0016\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00070M2\u0006\u0010Q\u001a\u00020\u0003H&J\u001e\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00070M2\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010R\u001a\u00020\u0003H&J\u0010\u0010X\u001a\u00020\t2\u0006\u0010G\u001a\u00020HH&J\u000e\u0010Y\u001a\b\u0012\u0004\u0012\u00020\t0MH&J\u0010\u0010Z\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020HH&J\u0010\u0010[\u001a\u00020\r2\u0006\u0010\\\u001a\u00020HH&J\u0016\u0010]\u001a\b\u0012\u0004\u0012\u00020\r0M2\u0006\u0010G\u001a\u00020HH&J\u0010\u0010^\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020HH&J\u0010\u0010_\u001a\u00020\u00112\u0006\u0010R\u001a\u00020\u0003H&J\u0010\u0010`\u001a\u00020\u00112\u0006\u0010a\u001a\u00020HH&J\u000e\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00110MH&J\u000e\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00110MH&J\u0016\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00110M2\u0006\u0010e\u001a\u00020HH&J\u001e\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00110M2\u0006\u0010e\u001a\u00020H2\u0006\u0010g\u001a\u00020HH&J\u0016\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00110M2\u0006\u0010i\u001a\u00020\u0003H&J\u0010\u0010j\u001a\u00020\u00132\u0006\u00109\u001a\u00020\u0003H&J\u000e\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00130MH&J\u0016\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00130M2\u0006\u0010Q\u001a\u00020\u0003H&J\u0010\u0010m\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u0003H&J\u0018\u0010n\u001a\u00020\u00152\u0006\u0010o\u001a\u00020\u00032\u0006\u0010p\u001a\u00020\u0003H&J\u000e\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00150MH&J\u0010\u0010r\u001a\u00020\u00172\u0006\u00109\u001a\u00020\u0003H&J\u0018\u0010s\u001a\u00020\u00172\u0006\u0010R\u001a\u00020\u00032\u0006\u0010t\u001a\u00020\u0003H&J\u000e\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00170MH&J\u0012\u0010v\u001a\u0004\u0018\u00010\'2\u0006\u0010w\u001a\u00020\u0003H&J\u000e\u0010x\u001a\b\u0012\u0004\u0012\u00020\'0MH&J\b\u0010y\u001a\u00020\'H&J\u0010\u0010z\u001a\u00020\u00192\u0006\u00109\u001a\u00020\u0003H&J\u0010\u0010{\u001a\u00020\u00192\u0006\u0010t\u001a\u00020\u0003H&J\u0010\u0010|\u001a\u00020\u00192\u0006\u0010}\u001a\u00020HH&J\u000e\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00190MH&J\u0010\u0010\u007f\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\u0003H&J\u001b\u0010\u0080\u0001\u001a\u00020\u001b2\u0007\u0010\u0081\u0001\u001a\u00020\u00032\u0007\u0010\u0082\u0001\u001a\u00020\u0003H&J\u000f\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0MH&J\u0013\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u001d2\u0006\u00109\u001a\u00020\u0003H&J\u000f\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\u001d0MH&J\u000f\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\'0MH&J\u0017\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130M2\u0006\u0010Q\u001a\u00020\u0003H&J\u0011\u0010\u0088\u0001\u001a\u00020\u001f2\u0006\u00109\u001a\u00020\u0003H&J\u000f\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u001f0MH&J\u0012\u0010\u008a\u0001\u001a\u00020#2\u0007\u0010\u008b\u0001\u001a\u00020HH&J\u0012\u0010\u008c\u0001\u001a\u00020%2\u0007\u0010\u008b\u0001\u001a\u00020HH&J\u0013\u0010\u008d\u0001\u001a\u0004\u0018\u00010!2\u0006\u00109\u001a\u00020\u0003H&J\u0012\u0010\u008e\u0001\u001a\u00020!2\u0007\u0010\u008f\u0001\u001a\u00020HH&J\u0018\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020!0M2\u0007\u0010\u0091\u0001\u001a\u00020\u0003H&J\u0018\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020!0M2\u0007\u0010\u008b\u0001\u001a\u00020HH&J\u0013\u0010\u0093\u0001\u001a\u0004\u0018\u00010#2\u0006\u00109\u001a\u00020\u0003H&J\u0012\u0010\u0094\u0001\u001a\u00020#2\u0007\u0010\u008f\u0001\u001a\u00020HH&J\u000f\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020#0MH&J\u0018\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020#0M2\u0007\u0010\u008b\u0001\u001a\u00020HH&J\u0017\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020#0M2\u0006\u0010R\u001a\u00020\u0003H&J)\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020#0M2\u0007\u0010\u0099\u0001\u001a\u00020H2\u0006\u0010R\u001a\u00020\u00032\u0007\u0010\u009a\u0001\u001a\u00020\u0003H&J1\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020#0M2\u0007\u0010\u0099\u0001\u001a\u00020H2\u0006\u0010R\u001a\u00020\u00032\u0007\u0010\u009a\u0001\u001a\u00020\u00032\u0006\u0010O\u001a\u00020\u0003H&J\u0012\u0010\u009b\u0001\u001a\u00020%2\u0007\u0010\u008f\u0001\u001a\u00020HH&J1\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020%0M2\u0007\u0010\u0099\u0001\u001a\u00020H2\u0006\u0010R\u001a\u00020\u00032\u0007\u0010\u009a\u0001\u001a\u00020\u00032\u0006\u0010O\u001a\u00020\u0003H&J\u0013\u0010\u009d\u0001\u001a\u0004\u0018\u00010\'2\u0006\u00109\u001a\u00020\u0003H&J\u0012\u0010\u009e\u0001\u001a\u00020\'2\u0007\u0010\u008b\u0001\u001a\u00020HH&J\u000f\u0010\u009f\u0001\u001a\b\u0012\u0004\u0012\u00020\'0MH&J\u0018\u0010\u00a0\u0001\u001a\b\u0012\u0004\u0012\u00020\'0M2\u0007\u0010\u00a1\u0001\u001a\u00020\u0003H&J\u0012\u0010\u00a2\u0001\u001a\u00020\u00032\u0007\u0010\u00a1\u0001\u001a\u00020\u0003H&J\n\u0010\u00a3\u0001\u001a\u00030\u00a4\u0001H&J\n\u0010\u00a5\u0001\u001a\u00030\u00a4\u0001H&J\n\u0010\u00a6\u0001\u001a\u00030\u00a4\u0001H&J\n\u0010\u00a7\u0001\u001a\u00030\u00a4\u0001H&J\n\u0010\u00a8\u0001\u001a\u00030\u00a4\u0001H&J\n\u0010\u00a9\u0001\u001a\u00030\u00a4\u0001H&J\n\u0010\u00aa\u0001\u001a\u00030\u00a4\u0001H&J\n\u0010\u00ab\u0001\u001a\u00030\u00a4\u0001H&J\n\u0010\u00ac\u0001\u001a\u00030\u00a4\u0001H&J\n\u0010\u00ad\u0001\u001a\u00030\u00a4\u0001H&J\n\u0010\u00ae\u0001\u001a\u00030\u00a4\u0001H&J\n\u0010\u00af\u0001\u001a\u00030\u00a4\u0001H&J\n\u0010\u00b0\u0001\u001a\u00030\u00a4\u0001H&J\n\u0010\u00b1\u0001\u001a\u00030\u00a4\u0001H&J\u0018\u0010\u00b2\u0001\u001a\u00020)2\r\u0010\u00b3\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050MH&J\u0018\u0010\u00b4\u0001\u001a\u00020)2\r\u0010\u00b3\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070MH&J\u0018\u0010\u00b5\u0001\u001a\u00020)2\r\u0010\u00b3\u0001\u001a\b\u0012\u0004\u0012\u00020\u00110MH&J\u0018\u0010\u00b6\u0001\u001a\u00020)2\r\u0010\u00b3\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130MH&J\u0018\u0010\u00b7\u0001\u001a\u00020)2\r\u0010\u00b3\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150MH&J\u0018\u0010\u00b8\u0001\u001a\u00020)2\r\u0010\u00b3\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170MH&J\u0018\u0010\u00b9\u0001\u001a\u00020)2\r\u0010\u00b3\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190MH&J\u0018\u0010\u00ba\u0001\u001a\u00020)2\r\u0010\u00b3\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0MH&J\u0018\u0010\u00bb\u0001\u001a\u00020)2\r\u0010\u00b3\u0001\u001a\b\u0012\u0004\u0012\u00020\u001d0MH&J\u0018\u0010\u00bc\u0001\u001a\u00020)2\r\u0010\u00b3\u0001\u001a\b\u0012\u0004\u0012\u00020\u001f0MH&J\u0018\u0010\u00bd\u0001\u001a\u00020)2\r\u0010\u00b3\u0001\u001a\b\u0012\u0004\u0012\u00020!0MH&J\u0018\u0010\u00be\u0001\u001a\u00020)2\r\u0010\u00b3\u0001\u001a\b\u0012\u0004\u0012\u00020#0MH&J\u0018\u0010\u00bf\u0001\u001a\u00020)2\r\u0010\u00b3\u0001\u001a\b\u0012\u0004\u0012\u00020\'0MH&J\u0011\u0010\u00c0\u0001\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0011\u0010\u00c1\u0001\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0011\u0010\u00c2\u0001\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020\tH&J\u0011\u0010\u00c3\u0001\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020\u000bH&J\u0011\u0010\u00c4\u0001\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020\rH&J\u0011\u0010\u00c5\u0001\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020\u000fH&J\u0011\u0010\u00c6\u0001\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020\u0011H&J\u0011\u0010\u00c7\u0001\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020\u0013H&J\u0011\u0010\u00c8\u0001\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020\u0015H&J\u0011\u0010\u00c9\u0001\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020\u0017H&J\u0011\u0010\u00ca\u0001\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020\u0019H&J\u0011\u0010\u00cb\u0001\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020\u001bH&J\u0011\u0010\u00cc\u0001\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020\u001dH&J\u0011\u0010\u00cd\u0001\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020\u001fH&J\u0011\u0010\u00ce\u0001\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020!H&J\u0011\u0010\u00cf\u0001\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020#H&J\u0011\u0010\u00d0\u0001\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020%H&J\u0011\u0010\u00d1\u0001\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\'H&\u00a8\u0006\u00d2\u0001"}, d2 = {"Lcom/ttchain/walletproject/model/DbHelper;", "", "addAddressData", "", "data", "Lcom/ttchain/walletproject/database/data/AddressData;", "addAssetData", "Lcom/ttchain/walletproject/database/data/AssetData;", "addChatCommunicationData", "Lcom/ttchain/walletproject/database/data/ChatCommunicationData;", "addChatGroupData", "Lcom/ttchain/walletproject/database/data/ChatGroupData;", "addChatMessageData", "Lcom/ttchain/walletproject/database/data/ChatMessageData;", "addChatRoomData", "Lcom/ttchain/walletproject/database/data/ChatRoomData;", "addCoinData", "Lcom/ttchain/walletproject/database/data/CoinData;", "addCoinSelectionData", "Lcom/ttchain/walletproject/database/data/CoinSelectionData;", "addCoinToCoinRateData", "Lcom/ttchain/walletproject/database/data/CoinToCoinRateData;", "addCoinToFiatRateData", "Lcom/ttchain/walletproject/database/data/CoinToFiatRateData;", "addFiatData", "Lcom/ttchain/walletproject/database/data/FiatData;", "addFiatToFiatRateData", "Lcom/ttchain/walletproject/database/data/FiatToFiatRateData;", "addIdentityData", "Lcom/ttchain/walletproject/database/data/IdentityData;", "addLanguageData", "Lcom/ttchain/walletproject/database/data/LanguageData;", "addLightningTransRecordData", "Lcom/ttchain/walletproject/database/data/LightningTransRecordData;", "addTransRecordData", "Lcom/ttchain/walletproject/database/data/TransRecordData;", "addUsdtTransRecordData", "Lcom/ttchain/walletproject/database/data/UsdtTransRecordData;", "addWalletData", "Lcom/ttchain/walletproject/database/data/WalletData;", "clearAddressDataTable", "", "clearAllTableData", "clearAssetDataTable", "clearCoinDataTable", "clearCoinSelectionDataTable", "clearCoinToCoinRateDataTable", "clearCoinToFiatRateDataTable", "clearFiatDataTable", "clearFiatToFiatRateDataTable", "clearIdentityDataTable", "clearLanguageDataTable", "clearLightningTransRecordDataTable", "clearTransRecordDataTable", "clearUserIdentityRelativeTables", "clearWalletDataTable", "deleteAddressData", "_id", "deleteAssetData", "deleteChatCommunicationData", "deleteCoinData", "deleteCoinSelectionData", "deleteCoinToCoinRateData", "deleteCoinToFiatRateData", "deleteDb", "deleteFiatData", "deleteFiatToFiatRateData", "deleteIdentityData", "deleteLanguageData", "deleteLightningTransRecordData", "deleteMsgByRoomId", "roomId", "", "deleteTransRecordData", "deleteWalletData", "getAddressData", "getAddressDataList", "", "getAllLightningTransRecordDataList", "page", "getAssetDataByWalletIDAndCoinID", "walletID", "coinID", "getAssetDataList", "getAssetDataListByCoinIDs", "coinIds", "getAssetDataListByWalletID", "getAssetDataListByWalletIDAndCoinID", "getChatCommunicationByRoomId", "getChatCommunicationDataList", "getChatGroupDataByRoomId", "getChatMessageDataByMsgId", "msgId", "getChatMessageDataListByRoomId", "getChatRoomDataByRoomId", "getCoinData", "getCoinDataByCoinId", "coinId", "getCoinDataList", "getCoinDataListByDefaultIsDefaultSelected", "getCoinDataListByMainCoinId", "mainCoinId", "getCoinDataListByMainCoinIdAndWord", "word", "getCoinDataListByWalletTypeId", "typeId", "getCoinSelectionData", "getCoinSelectionDataList", "getCoinSelectionDataListByWalletID", "getCoinToCoinRateData", "getCoinToCoinRateDataByCoinID", "fromCoinID", "toCoinID", "getCoinToCoinRateDataList", "getCoinToFiatRateData", "getCoinToFiatRateDataFromCoinIDToFiatId", "fiatId", "getCoinToFiatRateDataList", "getDefaultSelectedWalletDataByIdentityID", "identityID", "getDefaultWalletDataList", "getDefaultWalletTypeWalletData", "getFiatData", "getFiatDataByFiatId", "getFiatDataByName", "name", "getFiatDataList", "getFiatToFiatRateData", "getFiatToFiatRateDataByFromFiatIDToFiatID", "fromFiatID", "toFiatID", "getFiatToFiatRateDataList", "getIdentityData", "getIdentityDataList", "getImportWalletDataList", "getIsSelectedCoinSelectionDataListByWalletID", "getLanguageData", "getLanguageDataList", "getLatestTransRecordDataByAddress", "address", "getLatestUsdtTransRecordDataByAddress", "getLightningTransRecordData", "getLightningTransRecordDataByTxId", "txId", "getLightningTransRecordDataList", "coin_Id", "getLightningTransRecordDataListByAddress", "getTransRecordData", "getTransRecordDataByTxId", "getTransRecordDataList", "getTransRecordDataListByAddress", "getTransRecordDataListByCoinID", "getTransRecordDataListByCondition", "walletAddress", "state", "getUsdtTransRecordDataByTxId", "getUsdtTransRecordDataListByCondition", "getWalletData", "getWalletDataByAddress", "getWalletDataList", "getWalletDataListByWalletType", "walletType", "getWalletDataListCountByWalletType", "isAddressDataEmpty", "", "isAssetDataEmpty", "isCoinDataEmpty", "isCoinSelectionDataEmpty", "isCoinToCoinRateDataEmpty", "isCoinToFiatRateDataEmpty", "isExistDb", "isFiatDataEmpty", "isFiatToFiatRateDataEmpty", "isIdentityDataEmpty", "isLanguageDataEmpty", "isLightningTransRecordDataEmpty", "isTransRecordDataEmpty", "isWalletDataEmpty", "setAddressDataList", "list", "setAssetDataList", "setCoinDataList", "setCoinSelectionDataList", "setCoinToCoinRateDataList", "setCoinToFiatRateDataList", "setFiatDataList", "setFiatToFiatRateDataList", "setIdentityDataList", "setLanguageDataList", "setLightningTransRecordDataList", "setTransRecordDataList", "setWalletDataList", "updateAddressData", "updateAssetData", "updateChatCommunicationData", "updateChatGroupData", "updateChatMessageData", "updateChatRoomData", "updateCoinData", "updateCoinSelectionData", "updateCoinToCoinRateData", "updateCoinToFiatRateData", "updateFiatData", "updateFiatToFiatRateData", "updateIdentityData", "updateLanguageData", "updateLightningTransRecordData", "updateTransRecordData", "updateUsdtTransRecordData", "updateWalletData", "app_proPlayDebug"})
public abstract interface DbHelper {
    
    public abstract void deleteDb();
    
    public abstract void clearAllTableData();
    
    public abstract void clearUserIdentityRelativeTables();
    
    public abstract boolean isExistDb();
    
    public abstract boolean isIdentityDataEmpty();
    
    public abstract void clearIdentityDataTable();
    
    public abstract int addIdentityData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.IdentityData data);
    
    public abstract void deleteIdentityData(int _id);
    
    public abstract void updateIdentityData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.IdentityData data);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.ttchain.walletproject.database.data.IdentityData getIdentityData(int _id);
    
    public abstract void setIdentityDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.IdentityData> list);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.IdentityData> getIdentityDataList();
    
    public abstract boolean isCoinDataEmpty();
    
    public abstract void clearCoinDataTable();
    
    public abstract int addCoinData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinData data);
    
    public abstract void updateCoinData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinData data);
    
    public abstract void deleteCoinData(int _id);
    
    public abstract void setCoinDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.CoinData> list);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.CoinData> getCoinDataList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.CoinData getCoinData(int coinID);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.CoinData getCoinDataByCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.CoinData> getCoinDataListByWalletTypeId(int typeId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.CoinData> getCoinDataListByMainCoinIdAndWord(@org.jetbrains.annotations.NotNull()
    java.lang.String mainCoinId, @org.jetbrains.annotations.NotNull()
    java.lang.String word);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.CoinData> getCoinDataListByDefaultIsDefaultSelected();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.CoinData> getCoinDataListByMainCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String mainCoinId);
    
    public abstract boolean isWalletDataEmpty();
    
    public abstract void clearWalletDataTable();
    
    public abstract int addWalletData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.WalletData data);
    
    public abstract int deleteWalletData(int _id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.ttchain.walletproject.database.data.WalletData getWalletData(int _id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.WalletData getDefaultWalletTypeWalletData();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.ttchain.walletproject.database.data.WalletData getDefaultSelectedWalletDataByIdentityID(int identityID);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.WalletData getWalletDataByAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address);
    
    public abstract int updateWalletData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.WalletData data);
    
    public abstract int getWalletDataListCountByWalletType(int walletType);
    
    public abstract void setWalletDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.WalletData> list);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.WalletData> getWalletDataList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.WalletData> getDefaultWalletDataList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.WalletData> getImportWalletDataList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.WalletData> getWalletDataListByWalletType(int walletType);
    
    public abstract boolean isCoinSelectionDataEmpty();
    
    public abstract void clearCoinSelectionDataTable();
    
    public abstract int addCoinSelectionData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinSelectionData data);
    
    public abstract void updateCoinSelectionData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinSelectionData data);
    
    public abstract void deleteCoinSelectionData(int _id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.CoinSelectionData getCoinSelectionData(int _id);
    
    public abstract void setCoinSelectionDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.CoinSelectionData> list);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.CoinSelectionData> getCoinSelectionDataList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.CoinSelectionData> getCoinSelectionDataListByWalletID(int walletID);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.CoinSelectionData> getIsSelectedCoinSelectionDataListByWalletID(int walletID);
    
    public abstract boolean isAssetDataEmpty();
    
    public abstract void clearAssetDataTable();
    
    public abstract int addAssetData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.AssetData data);
    
    public abstract void updateAssetData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.AssetData data);
    
    public abstract void setAssetDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.AssetData> list);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.AssetData> getAssetDataList();
    
    public abstract void deleteAssetData(int _id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.AssetData getAssetDataByWalletIDAndCoinID(int walletID, int coinID);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.AssetData> getAssetDataListByCoinIDs(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> coinIds);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.AssetData> getAssetDataListByWalletID(int walletID);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.AssetData> getAssetDataListByWalletIDAndCoinID(int walletID, int coinID);
    
    public abstract boolean isAddressDataEmpty();
    
    public abstract void clearAddressDataTable();
    
    public abstract int addAddressData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.AddressData data);
    
    public abstract void updateAddressData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.AddressData data);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.AddressData getAddressData(int _id);
    
    public abstract void deleteAddressData(int _id);
    
    public abstract void setAddressDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.AddressData> list);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.AddressData> getAddressDataList();
    
    public abstract boolean isFiatDataEmpty();
    
    public abstract void clearFiatDataTable();
    
    public abstract int addFiatData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.FiatData data);
    
    public abstract void updateFiatData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.FiatData data);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.FiatData getFiatData(int _id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.FiatData getFiatDataByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.FiatData getFiatDataByFiatId(int fiatId);
    
    public abstract void deleteFiatData(int _id);
    
    public abstract void setFiatDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.FiatData> list);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.FiatData> getFiatDataList();
    
    public abstract boolean isLanguageDataEmpty();
    
    public abstract void clearLanguageDataTable();
    
    public abstract int addLanguageData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.LanguageData data);
    
    public abstract void updateLanguageData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.LanguageData data);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.LanguageData getLanguageData(int _id);
    
    public abstract void deleteLanguageData(int _id);
    
    public abstract void setLanguageDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.LanguageData> list);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.LanguageData> getLanguageDataList();
    
    public abstract boolean isCoinToCoinRateDataEmpty();
    
    public abstract void clearCoinToCoinRateDataTable();
    
    public abstract int addCoinToCoinRateData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinToCoinRateData data);
    
    public abstract void updateCoinToCoinRateData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinToCoinRateData data);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.CoinToCoinRateData getCoinToCoinRateData(int _id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.CoinToCoinRateData getCoinToCoinRateDataByCoinID(int fromCoinID, int toCoinID);
    
    public abstract void deleteCoinToCoinRateData(int _id);
    
    public abstract void setCoinToCoinRateDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.CoinToCoinRateData> list);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.CoinToCoinRateData> getCoinToCoinRateDataList();
    
    public abstract boolean isCoinToFiatRateDataEmpty();
    
    public abstract void clearCoinToFiatRateDataTable();
    
    public abstract int addCoinToFiatRateData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinToFiatRateData data);
    
    public abstract void updateCoinToFiatRateData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinToFiatRateData data);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.CoinToFiatRateData getCoinToFiatRateData(int _id);
    
    public abstract void deleteCoinToFiatRateData(int _id);
    
    public abstract void setCoinToFiatRateDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.CoinToFiatRateData> list);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.CoinToFiatRateData> getCoinToFiatRateDataList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.CoinToFiatRateData getCoinToFiatRateDataFromCoinIDToFiatId(int coinID, int fiatId);
    
    public abstract boolean isFiatToFiatRateDataEmpty();
    
    public abstract void clearFiatToFiatRateDataTable();
    
    public abstract int addFiatToFiatRateData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.FiatToFiatRateData data);
    
    public abstract void updateFiatToFiatRateData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.FiatToFiatRateData data);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.FiatToFiatRateData getFiatToFiatRateData(int _id);
    
    public abstract void deleteFiatToFiatRateData(int _id);
    
    public abstract void setFiatToFiatRateDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.FiatToFiatRateData> list);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.FiatToFiatRateData> getFiatToFiatRateDataList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.FiatToFiatRateData getFiatToFiatRateDataByFromFiatIDToFiatID(int fromFiatID, int toFiatID);
    
    public abstract boolean isTransRecordDataEmpty();
    
    public abstract void clearTransRecordDataTable();
    
    public abstract int addTransRecordData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.TransRecordData data);
    
    public abstract void deleteTransRecordData(int _id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.ttchain.walletproject.database.data.TransRecordData getTransRecordData(int _id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.TransRecordData getTransRecordDataByTxId(@org.jetbrains.annotations.NotNull()
    java.lang.String txId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.TransRecordData> getTransRecordDataListByAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.TransRecordData getLatestTransRecordDataByAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address);
    
    public abstract void updateTransRecordData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.TransRecordData data);
    
    public abstract void setTransRecordDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.TransRecordData> list);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.TransRecordData> getTransRecordDataList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.TransRecordData> getTransRecordDataListByCoinID(int coinID);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.TransRecordData> getTransRecordDataListByCondition(@org.jetbrains.annotations.NotNull()
    java.lang.String walletAddress, int coinID, int state);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.TransRecordData> getTransRecordDataListByCondition(@org.jetbrains.annotations.NotNull()
    java.lang.String walletAddress, int coinID, int state, int page);
    
    public abstract boolean isLightningTransRecordDataEmpty();
    
    public abstract void clearLightningTransRecordDataTable();
    
    public abstract int addLightningTransRecordData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.LightningTransRecordData data);
    
    public abstract void deleteLightningTransRecordData(int _id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.ttchain.walletproject.database.data.LightningTransRecordData getLightningTransRecordData(int _id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.LightningTransRecordData getLightningTransRecordDataByTxId(@org.jetbrains.annotations.NotNull()
    java.lang.String txId);
    
    public abstract void updateLightningTransRecordData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.LightningTransRecordData data);
    
    public abstract void setLightningTransRecordDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.LightningTransRecordData> list);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.LightningTransRecordData> getLightningTransRecordDataList(int coin_Id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.LightningTransRecordData> getLightningTransRecordDataListByAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.LightningTransRecordData> getAllLightningTransRecordDataList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.LightningTransRecordData> getAllLightningTransRecordDataList(int page);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.UsdtTransRecordData getUsdtTransRecordDataByTxId(@org.jetbrains.annotations.NotNull()
    java.lang.String txId);
    
    public abstract int addUsdtTransRecordData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.UsdtTransRecordData data);
    
    public abstract void updateUsdtTransRecordData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.UsdtTransRecordData data);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.UsdtTransRecordData> getUsdtTransRecordDataListByCondition(@org.jetbrains.annotations.NotNull()
    java.lang.String walletAddress, int coinID, int state, int page);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.UsdtTransRecordData getLatestUsdtTransRecordDataByAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address);
    
    public abstract int addChatRoomData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.ChatRoomData data);
    
    public abstract void updateChatRoomData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.ChatRoomData data);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.ChatRoomData getChatRoomDataByRoomId(@org.jetbrains.annotations.NotNull()
    java.lang.String roomId);
    
    public abstract int addChatMessageData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.ChatMessageData data);
    
    public abstract void updateChatMessageData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.ChatMessageData data);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.ChatMessageData> getChatMessageDataListByRoomId(@org.jetbrains.annotations.NotNull()
    java.lang.String roomId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.ChatMessageData getChatMessageDataByMsgId(@org.jetbrains.annotations.NotNull()
    java.lang.String msgId);
    
    public abstract void deleteMsgByRoomId(@org.jetbrains.annotations.NotNull()
    java.lang.String roomId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.ChatCommunicationData> getChatCommunicationDataList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.ChatCommunicationData getChatCommunicationByRoomId(@org.jetbrains.annotations.NotNull()
    java.lang.String roomId);
    
    public abstract void updateChatCommunicationData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.ChatCommunicationData data);
    
    public abstract int addChatCommunicationData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.ChatCommunicationData data);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ttchain.walletproject.database.data.ChatGroupData getChatGroupDataByRoomId(@org.jetbrains.annotations.NotNull()
    java.lang.String roomId);
    
    public abstract void updateChatGroupData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.ChatGroupData data);
    
    public abstract int addChatGroupData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.ChatGroupData data);
    
    public abstract void deleteChatCommunicationData(int _id);
}