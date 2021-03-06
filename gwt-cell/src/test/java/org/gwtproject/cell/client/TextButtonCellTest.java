/*
 * Copyright 2018 The GWT Project Authors
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.gwtproject.cell.client;

import org.gwtproject.safehtml.shared.SafeHtmlBuilder;

/**
 * Tests for {@link org.gwtproject.cell.client.TextButtonCell}.
 */
public class TextButtonCellTest extends ButtonCellTestBase<String> {

  @Override
  protected org.gwtproject.cell.client.TextButtonCell createCell() {
    return new TextButtonCell();
  }

  @Override
  protected String createCellValue() {
    return "clickme";
  }

  @Override
  protected String getExpectedInnerHtml() {
    return getExpectedInnerHtmlImpl("clickme");
  }

  @Override
  protected String getExpectedInnerHtmlNull() {
    return getExpectedInnerHtmlImpl("");
  }

  private String getExpectedInnerHtmlImpl(String value) {
    Cell<String> cell = createCell();
    SafeHtmlBuilder sb = new SafeHtmlBuilder();
    cell.render(null, "$value$", sb);
    String html = sb.toSafeHtml().asString();
    html = html.replace("$value$", value);
    return html;
  }
}
