package com.demo.spring;

import org.infinispan.protostream.GeneratedSchema;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;

import com.demo.spring.model.UserDetail;

@AutoProtoSchemaBuilder(
      includeClasses = {
            UserDetail.class
      },
      schemaFileName = "user.proto",
      schemaFilePath = "proto/",
      schemaPackageName = "user_detail")
interface LibraryInitializer extends GeneratedSchema {

}