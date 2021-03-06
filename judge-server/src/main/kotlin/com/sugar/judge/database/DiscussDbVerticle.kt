/*
 * MIT License
 *
 * Copyright (c) 2018 Kisuke.Yang
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.sugar.judge.database

import com.sugar.judge.config.EventBusNamespace
import io.reactiverse.pgclient.PgClient
import io.vertx.core.json.JsonObject
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class DiscussDbVerticle : AbstractDbVerticle(){

    private val logger = LoggerFactory.getLogger(DiscussDbVerticle::class.java)

    override val listenAddress: String
        get() = EventBusNamespace.ADDR_DISCUSS_DB.get()

    override fun start() {
        super.start()
    }

    override suspend fun processMethods(params: JsonObject, method: EventBusNamespace): JsonObject {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun log(): Logger {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}