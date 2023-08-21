package io.confluent.connect.s3;

import org.apache.kafka.connect.connector.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jay.yang
 * @date 8/9/23
 */
public class ProcoreS3SinkConnector extends S3SinkConnector {
    private static final Logger log = LoggerFactory.getLogger(ProcoreS3SinkConnector.class);

    @Override
    public Class<? extends Task> taskClass() {
        return ProcoreS3SinkTask.class;
    }

}
