/*
 *  Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.alibaba.fescar.core.protocol.transaction;

import com.alibaba.fescar.core.rpc.RpcContext;

public interface TCInboundHandler {

    GlobalBeginResponse handle(GlobalBeginRequest globalBegin, RpcContext rpcContext);

    GlobalCommitResponse handle(GlobalCommitRequest globalCommit, RpcContext rpcContext);

    GlobalRollbackResponse handle(GlobalRollbackRequest globalRollback, RpcContext rpcContext);

    BranchRegisterResponse handle(BranchRegisterRequest branchRegister, RpcContext rpcContext);

    BranchReportResponse handle(BranchReportRequest branchReport, RpcContext rpcContext);

    GlobalLockQueryResponse handle(GlobalLockQueryRequest checkLock, RpcContext rpcContext);

    GlobalStatusResponse handle(GlobalStatusRequest globalStatus, RpcContext rpcContext);


}
