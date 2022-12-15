 * SPDX-FileCopyrightText: 1989 - 1994, Julianne Frances Haugh
 * SPDX-FileCopyrightText: 1996 - 2000, Marek Michałkiewicz
 * SPDX-FileCopyrightText: 2001 - 2006, Tomasz Kłoczko
 * SPDX-FileCopyrightText: 2007 - 2011, Nicolas François
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

#include <config.h>

#ident "$Id$"

#include <errno.h>
#include <fcntl.h>
#include <getopt.h>
#include <pwd.h>
#include <signal.h>
#include <stdio.h>
#include <sys/types.h>
#include <time.h>
#include "defines.h"
#include "getdef.h"
#include "nscd.h"
#include "sssd.h"
#include "prototypes.h"
#include "pwauth.h"
#include "pwio.h"
#include "shadowio.h"
#include "shadowlog.h"
