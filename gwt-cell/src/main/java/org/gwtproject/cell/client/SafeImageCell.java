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
import org.gwtproject.safehtml.shared.SafeUri;

/**
 * <p>
 * An {@link AbstractCell} used to render an image by using a {@link SafeUri}.
 * </p>
 * <p>
 * If the images being displayed are static or available at compile time, using
 * {@link ImageResourceCell} will usually be more efficient.
 * </p>
 *
 * @see ImageCell
 * @see ImageResourceCell
 */
public class SafeImageCell
  extends AbstractCell<SafeUri> {

  /**
   * Construct a new SafeImageCell.
   */
  public SafeImageCell() {
  }

  @Override
  public void render(Context context,
                     SafeUri value,
                     SafeHtmlBuilder sb) {
    if (value != null) {
      sb.appendHtmlConstant("<img src=\"")
        .appendHtmlConstant(value.asString()) // TODO: check if this will work!
        .appendHtmlConstant("\"/>");
    }
  }
}
