package com.alibaba.alink.operator.stream.dataproc.format;

import org.apache.flink.ml.api.misc.param.Params;

import com.alibaba.alink.operator.common.dataproc.format.FormatType;
import com.alibaba.alink.params.dataproc.format.KvToCsvParams;

/**
 * Transform data type from Kv to Csv.
 */
public class KvToCsvStreamOp extends BaseFormatTransStreamOp <KvToCsvStreamOp>
	implements KvToCsvParams <KvToCsvStreamOp> {

	private static final long serialVersionUID = 1364131618084402185L;

	public KvToCsvStreamOp() {
		this(new Params());
	}

	public KvToCsvStreamOp(Params params) {
		super(FormatType.KV, FormatType.CSV, params);
	}
}
