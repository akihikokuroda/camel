/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.azure.storage.blob.BlobComponent;

/**
 * Store and retrieve blobs from Azure Storage Blob Service using SDK v12.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AzureStorageBlobComponentBuilderFactory {

    /**
     * Azure Storage Blob Service (camel-azure-storage-blob)
     * Store and retrieve blobs from Azure Storage Blob Service using SDK v12.
     * 
     * Category: cloud,file
     * Since: 3.3
     * Maven coordinates: org.apache.camel:camel-azure-storage-blob
     */
    static AzureStorageBlobComponentBuilder azureStorageBlob() {
        return new AzureStorageBlobComponentBuilderImpl();
    }

    /**
     * Builder for the Azure Storage Blob Service component.
     */
    interface AzureStorageBlobComponentBuilder
            extends
                ComponentBuilder<BlobComponent> {
        /**
         * Setting the autoDiscoverClient mechanism, if true, the component will
         * look for a client instance in the registry automatically otherwise it
         * will skip that checking.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default AzureStorageBlobComponentBuilder autoDiscoverClient(
                boolean autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
            return this;
        }
        /**
         * The blob name, required for consumer. However on producer, is only
         * required for the operations on the blob level.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AzureStorageBlobComponentBuilder blobName(
                java.lang.String blobName) {
            doSetProperty("blobName", blobName);
            return this;
        }
        /**
         * Set the blob offset for the upload or download operations, default is
         * 0.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 0
         * Group: common
         */
        default AzureStorageBlobComponentBuilder blobOffset(long blobOffset) {
            doSetProperty("blobOffset", blobOffset);
            return this;
        }
        /**
         * The blob type in order to initiate the appropriate settings for each
         * blob type.
         * 
         * The option is a:
         * <code>org.apache.camel.component.azure.storage.blob.BlobType</code>
         * type.
         * 
         * Default: blockblob
         * Group: common
         */
        default AzureStorageBlobComponentBuilder blobType(
                org.apache.camel.component.azure.storage.blob.BlobType blobType) {
            doSetProperty("blobType", blobType);
            return this;
        }
        /**
         * Close the stream after read or keep it open, default is true.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default AzureStorageBlobComponentBuilder closeStreamAfterRead(
                boolean closeStreamAfterRead) {
            doSetProperty("closeStreamAfterRead", closeStreamAfterRead);
            return this;
        }
        /**
         * The component configurations.
         * 
         * The option is a:
         * <code>org.apache.camel.component.azure.storage.blob.BlobConfiguration</code> type.
         * 
         * Group: common
         */
        default AzureStorageBlobComponentBuilder configuration(
                org.apache.camel.component.azure.storage.blob.BlobConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * StorageSharedKeyCredential can be injected to create the azure
         * client, this holds the important authentication information.
         * 
         * The option is a:
         * <code>com.azure.storage.common.StorageSharedKeyCredential</code>
         * type.
         * 
         * Group: common
         */
        default AzureStorageBlobComponentBuilder credentials(
                com.azure.storage.common.StorageSharedKeyCredential credentials) {
            doSetProperty("credentials", credentials);
            return this;
        }
        /**
         * How many bytes to include in the range. Must be greater than or equal
         * to 0 if specified.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: common
         */
        default AzureStorageBlobComponentBuilder dataCount(
                java.lang.Long dataCount) {
            doSetProperty("dataCount", dataCount);
            return this;
        }
        /**
         * The file directory where the downloaded blobs will be saved to, this
         * can be used in both, producer and consumer.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AzureStorageBlobComponentBuilder fileDir(
                java.lang.String fileDir) {
            doSetProperty("fileDir", fileDir);
            return this;
        }
        /**
         * Specifies the maximum number of blobs to return, including all
         * BlobPrefix elements. If the request does not specify
         * maxResultsPerPage or specifies a value greater than 5,000, the server
         * will return up to 5,000 items.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: common
         */
        default AzureStorageBlobComponentBuilder maxResultsPerPage(
                java.lang.Integer maxResultsPerPage) {
            doSetProperty("maxResultsPerPage", maxResultsPerPage);
            return this;
        }
        /**
         * Specifies the maximum number of additional HTTP Get requests that
         * will be made while reading the data from a response body.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 0
         * Group: common
         */
        default AzureStorageBlobComponentBuilder maxRetryRequests(
                int maxRetryRequests) {
            doSetProperty("maxRetryRequests", maxRetryRequests);
            return this;
        }
        /**
         * Filters the results to return only blobs whose names begin with the
         * specified prefix. May be null to return all blobs.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AzureStorageBlobComponentBuilder prefix(java.lang.String prefix) {
            doSetProperty("prefix", prefix);
            return this;
        }
        /**
         * Client to a storage account. This client does not hold any state
         * about a particular storage account but is instead a convenient way of
         * sending off appropriate requests to the resource on the service. It
         * may also be used to construct URLs to blobs and containers. This
         * client contains operations on a service account. Operations on a
         * container are available on BlobContainerClient through
         * getBlobContainerClient(String), and operations on a blob are
         * available on BlobClient through
         * getBlobContainerClient(String).getBlobClient(String).
         * 
         * The option is a:
         * <code>com.azure.storage.blob.BlobServiceClient</code> type.
         * 
         * Group: common
         */
        default AzureStorageBlobComponentBuilder serviceClient(
                com.azure.storage.blob.BlobServiceClient serviceClient) {
            doSetProperty("serviceClient", serviceClient);
            return this;
        }
        /**
         * An optional timeout value beyond which a RuntimeException will be
         * raised.
         * 
         * The option is a: <code>java.time.Duration</code> type.
         * 
         * Group: common
         */
        default AzureStorageBlobComponentBuilder timeout(
                java.time.Duration timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default AzureStorageBlobComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * A user-controlled value that you can use to track requests. The value
         * of the sequence number must be between 0 and 263 - 1.The default
         * value is 0.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default AzureStorageBlobComponentBuilder blobSequenceNumber(
                java.lang.Long blobSequenceNumber) {
            doSetProperty("blobSequenceNumber", blobSequenceNumber);
            return this;
        }
        /**
         * Specifies which type of blocks to return.
         * 
         * The option is a:
         * <code>com.azure.storage.blob.models.BlockListType</code> type.
         * 
         * Default: COMMITTED
         * Group: producer
         */
        default AzureStorageBlobComponentBuilder blockListType(
                com.azure.storage.blob.models.BlockListType blockListType) {
            doSetProperty("blockListType", blockListType);
            return this;
        }
        /**
         * Close the stream after write or keep it open, default is true.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default AzureStorageBlobComponentBuilder closeStreamAfterWrite(
                boolean closeStreamAfterWrite) {
            doSetProperty("closeStreamAfterWrite", closeStreamAfterWrite);
            return this;
        }
        /**
         * When is set to true, the staged blocks will not be committed
         * directly.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default AzureStorageBlobComponentBuilder commitBlockListLater(
                boolean commitBlockListLater) {
            doSetProperty("commitBlockListLater", commitBlockListLater);
            return this;
        }
        /**
         * When is set to true, the append blocks will be created when
         * committing append blocks.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default AzureStorageBlobComponentBuilder createAppendBlob(
                boolean createAppendBlob) {
            doSetProperty("createAppendBlob", createAppendBlob);
            return this;
        }
        /**
         * When is set to true, the page blob will be created when uploading
         * page blob.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default AzureStorageBlobComponentBuilder createPageBlob(
                boolean createPageBlob) {
            doSetProperty("createPageBlob", createPageBlob);
            return this;
        }
        /**
         * Override the default expiration (millis) of URL download link.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: producer
         */
        default AzureStorageBlobComponentBuilder downloadLinkExpiration(
                java.lang.Long downloadLinkExpiration) {
            doSetProperty("downloadLinkExpiration", downloadLinkExpiration);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default AzureStorageBlobComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The blob operation that can be used with this component on the
         * producer.
         * 
         * The option is a:
         * <code>org.apache.camel.component.azure.storage.blob.BlobOperationsDefinition</code> type.
         * 
         * Default: listBlobContainers
         * Group: producer
         */
        default AzureStorageBlobComponentBuilder operation(
                org.apache.camel.component.azure.storage.blob.BlobOperationsDefinition operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Specifies the maximum size for the page blob, up to 8 TB. The page
         * blob size must be aligned to a 512-byte boundary.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Default: 512
         * Group: producer
         */
        default AzureStorageBlobComponentBuilder pageBlobSize(
                java.lang.Long pageBlobSize) {
            doSetProperty("pageBlobSize", pageBlobSize);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AzureStorageBlobComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Access key for the associated azure account name to be used for
         * authentication with azure blob services.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default AzureStorageBlobComponentBuilder accessKey(
                java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
    }

    class AzureStorageBlobComponentBuilderImpl
            extends
                AbstractComponentBuilder<BlobComponent>
            implements
                AzureStorageBlobComponentBuilder {
        @Override
        protected BlobComponent buildConcreteComponent() {
            return new BlobComponent();
        }
        private org.apache.camel.component.azure.storage.blob.BlobConfiguration getOrCreateConfiguration(
                org.apache.camel.component.azure.storage.blob.BlobComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.azure.storage.blob.BlobConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "autoDiscoverClient": getOrCreateConfiguration((BlobComponent) component).setAutoDiscoverClient((boolean) value); return true;
            case "blobName": getOrCreateConfiguration((BlobComponent) component).setBlobName((java.lang.String) value); return true;
            case "blobOffset": getOrCreateConfiguration((BlobComponent) component).setBlobOffset((long) value); return true;
            case "blobType": getOrCreateConfiguration((BlobComponent) component).setBlobType((org.apache.camel.component.azure.storage.blob.BlobType) value); return true;
            case "closeStreamAfterRead": getOrCreateConfiguration((BlobComponent) component).setCloseStreamAfterRead((boolean) value); return true;
            case "configuration": ((BlobComponent) component).setConfiguration((org.apache.camel.component.azure.storage.blob.BlobConfiguration) value); return true;
            case "credentials": getOrCreateConfiguration((BlobComponent) component).setCredentials((com.azure.storage.common.StorageSharedKeyCredential) value); return true;
            case "dataCount": getOrCreateConfiguration((BlobComponent) component).setDataCount((java.lang.Long) value); return true;
            case "fileDir": getOrCreateConfiguration((BlobComponent) component).setFileDir((java.lang.String) value); return true;
            case "maxResultsPerPage": getOrCreateConfiguration((BlobComponent) component).setMaxResultsPerPage((java.lang.Integer) value); return true;
            case "maxRetryRequests": getOrCreateConfiguration((BlobComponent) component).setMaxRetryRequests((int) value); return true;
            case "prefix": getOrCreateConfiguration((BlobComponent) component).setPrefix((java.lang.String) value); return true;
            case "serviceClient": getOrCreateConfiguration((BlobComponent) component).setServiceClient((com.azure.storage.blob.BlobServiceClient) value); return true;
            case "timeout": getOrCreateConfiguration((BlobComponent) component).setTimeout((java.time.Duration) value); return true;
            case "bridgeErrorHandler": ((BlobComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "blobSequenceNumber": getOrCreateConfiguration((BlobComponent) component).setBlobSequenceNumber((java.lang.Long) value); return true;
            case "blockListType": getOrCreateConfiguration((BlobComponent) component).setBlockListType((com.azure.storage.blob.models.BlockListType) value); return true;
            case "closeStreamAfterWrite": getOrCreateConfiguration((BlobComponent) component).setCloseStreamAfterWrite((boolean) value); return true;
            case "commitBlockListLater": getOrCreateConfiguration((BlobComponent) component).setCommitBlockListLater((boolean) value); return true;
            case "createAppendBlob": getOrCreateConfiguration((BlobComponent) component).setCreateAppendBlob((boolean) value); return true;
            case "createPageBlob": getOrCreateConfiguration((BlobComponent) component).setCreatePageBlob((boolean) value); return true;
            case "downloadLinkExpiration": getOrCreateConfiguration((BlobComponent) component).setDownloadLinkExpiration((java.lang.Long) value); return true;
            case "lazyStartProducer": ((BlobComponent) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((BlobComponent) component).setOperation((org.apache.camel.component.azure.storage.blob.BlobOperationsDefinition) value); return true;
            case "pageBlobSize": getOrCreateConfiguration((BlobComponent) component).setPageBlobSize((java.lang.Long) value); return true;
            case "basicPropertyBinding": ((BlobComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "accessKey": getOrCreateConfiguration((BlobComponent) component).setAccessKey((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}