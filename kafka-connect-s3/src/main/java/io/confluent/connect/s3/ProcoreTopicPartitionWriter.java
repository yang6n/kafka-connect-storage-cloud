package io.confluent.connect.s3;

import io.confluent.common.utils.Time;
import io.confluent.connect.s3.storage.S3Storage;
import io.confluent.connect.storage.format.RecordWriterProvider;
import io.confluent.connect.storage.partitioner.Partitioner;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.connect.sink.ErrantRecordReporter;
import org.apache.kafka.connect.sink.SinkTaskContext;

/**
 * @author jay.yang
 * @date 8/21/23
 */
public class ProcoreTopicPartitionWriter extends TopicPartitionWriter {
    public ProcoreTopicPartitionWriter(TopicPartition tp, S3Storage storage, RecordWriterProvider<S3SinkConnectorConfig> writerProvider, Partitioner<?> partitioner, S3SinkConnectorConfig connectorConfig, SinkTaskContext context, ErrantRecordReporter reporter) {
        super(tp, storage, writerProvider, partitioner, connectorConfig, context, reporter);
    }

    ProcoreTopicPartitionWriter(TopicPartition tp, S3Storage storage, RecordWriterProvider<S3SinkConnectorConfig> writerProvider, Partitioner<?> partitioner, S3SinkConnectorConfig connectorConfig, SinkTaskContext context, Time time, ErrantRecordReporter reporter) {
        super(tp, storage, writerProvider, partitioner, connectorConfig, context, time, reporter);
    }


}
