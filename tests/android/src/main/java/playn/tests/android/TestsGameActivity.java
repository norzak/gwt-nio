/**
 * Copyright 2010 The PlayN Authors
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
package playn.tests.android;

import android.util.DisplayMetrics;
import playn.android.GameActivity;

import playn.tests.core.TestsGame;

public class TestsGameActivity extends GameActivity {

  public TestsGame game;

  @Override public void main () {
    game = new TestsGame(platform(), new String[0]);
  }

  @Override public void onBackPressed () {
    if (!game.onHardwardBack()) super.onBackPressed();
  }

  @Override protected boolean usePortraitOrientation() {
    return true;
  }

  protected float scaleFactor () {
    DisplayMetrics dm = getResources().getDisplayMetrics();
    return Math.min(2, dm.density);
  }
}
