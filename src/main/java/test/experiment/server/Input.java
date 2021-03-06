/*
 * Copyright 2019 Google LLC. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package test.experiment.server;

import java.util.Optional;
import javax.annotation.Nullable;
import test.experiment.core.Direction;

class Input {

  @Nullable private final Direction nextDirection;

  Input(Direction nextDirection) {
    this.nextDirection = nextDirection;
  }

  Optional<Direction> getNextDirection() {
    return Optional.ofNullable(nextDirection);
  }
}
