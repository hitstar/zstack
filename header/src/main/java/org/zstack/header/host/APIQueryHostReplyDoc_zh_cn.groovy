package org.zstack.header.host

import org.zstack.header.errorcode.ErrorCode
import org.zstack.header.host.HostInventory

doc {

	title "获取物理机清单"

	ref {
		name "error"
		path "org.zstack.header.host.APIQueryHostReply.error"
		desc "错误码，若不为null，则表示操作失败, 操作成功时该字段为null",false
		type "ErrorCode"
		since "0.6"
		clz ErrorCode.class
	}
	ref {
		name "inventories"
		path "org.zstack.header.host.APIQueryHostReply.inventories"
		desc "null"
		type "List"
		since "0.6"
		clz HostInventory.class
	}
}
