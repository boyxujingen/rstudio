/*
 * ObjectExplorerServerOperations.java
 *
 * Copyright (C) 2009-17 by RStudio, Inc.
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */
package org.rstudio.studio.client.workbench.views.source.editors.explorer;

import org.rstudio.studio.client.server.ServerRequestCallback;
import org.rstudio.studio.client.workbench.views.source.editors.explorer.model.ObjectExplorerInspectionResult;

import com.google.gwt.core.client.JsArrayString;

public interface ObjectExplorerServerOperations
{
   void explorerInspectObject(
         String handleId,
         String extractingCode,
         String objectName,
         String objectAccess,
         JsArrayString tags,
         ServerRequestCallback<ObjectExplorerInspectionResult> requestCallback);
   
   void explorerBeginInspect(
         String handleId,
         String objectName,
         ServerRequestCallback<ObjectExplorerInspectionResult> requestCallback);
}