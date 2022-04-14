/*******************************************************************************
* Copyright (c) 2021 IBM Corporation and others.
*
* This program and the accompanying materials are made available under the
* terms of the Eclipse Public License v. 2.0 which is available at
* http://www.eclipse.org/legal/epl-2.0.
*
* SPDX-License-Identifier: EPL-2.0
*
* Contributors:
*     IBM Corporation - initial API and implementation
*******************************************************************************/

package org.eclipse.lsp4jakarta.jdt.core.annotations;

import org.eclipse.lsp4jakarta.jdt.codeAction.proposal.quickfix.InsertAnnotationAttributesQuickFix;

/**
 * Quickfix for adding missing name to @Resource
 * 
 * @author Zijian Pei
 *
 */
public class AddResourceMissingNameQuickFix extends InsertAnnotationAttributesQuickFix {

    public AddResourceMissingNameQuickFix() {
        super("jakarta.annotation.Resource", false, "name");
    }

}
