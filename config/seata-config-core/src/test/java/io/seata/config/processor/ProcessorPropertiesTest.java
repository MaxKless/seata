/*
 *  Copyright 1999-2019 Seata.io Group.
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

package io.seata.config.processor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Properties;

/**
 * @author liuqiufeng
 */
class ProcessorPropertiesTest {

    @Test
    void processor() throws IOException {
        String properties = "registry.type=file\n" +
                "registry.file.name=file-test-pro.conf";
        
        Properties processor = new ProcessorProperties().processor(properties);
        Assertions.assertEquals("file", processor.get("registry.type"));
        // not exist
        Assertions.assertNull(processor.get("registry"));
        Assertions.assertNull(processor.get("null"));
    }
}