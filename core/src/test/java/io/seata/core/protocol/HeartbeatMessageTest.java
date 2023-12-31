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
package io.seata.core.protocol;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link HeartbeatMessage}.
 *
 * @author Mia0451
 */
class HeartbeatMessageTest {

    @Test
    void getTypeCode() {
        Assertions.assertEquals(MessageType.TYPE_HEARTBEAT_MSG, HeartbeatMessage.PING.getTypeCode());
        Assertions.assertEquals(MessageType.TYPE_HEARTBEAT_MSG, HeartbeatMessage.PONG.getTypeCode());
    }

    @Test
    void testToString() {
        Assertions.assertEquals("services ping", HeartbeatMessage.PING.toString());
        Assertions.assertEquals("services pong", HeartbeatMessage.PONG.toString());
    }
}