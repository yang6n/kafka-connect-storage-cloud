package io.confluent.connect.s3;

import org.apache.kafka.common.TopicPartition;

/**
 * @author jay.yang
 * @date 8/21/23
 */
public class ProcoreS3SinkTask extends S3SinkTask {
    protected TopicPartitionWriter newTopicPartitionWriter(TopicPartition tp) {
        return new TopicPartitionWriter(
                tp,
                storage,
                writerProvider,
                partitioner,
                connectorConfig,
                context,
                time,
                reporter
        );
    }
}
