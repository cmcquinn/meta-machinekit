# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Very fast asynchronous FTP server library"
HOMEPAGE = "https://github.com/giampaolo/pyftpdlib/"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f81ad04756fa5632f5ab66448ec5cbaf"

SRC_URI = "git://github.com/giampaolo/pyftpdlib/;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "336b342e854bf5f182ad33db70401070184387a5"

S = "${WORKDIR}/git"

inherit setuptools3

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python3-core"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    OpenSSL
#    StringIO
#    __future__
#    _winreg
#    asynchat
#    asyncore
#    collections
#    contextlib
#    crypt
#    ctypes
#    curses
#    datetime
#    dummy_threading
#    ftplib
#    functools
#    glob
#    heapq
#    inspect
#    io
#    logging
#    mock
#    multiprocessing
#    optparse
#    os
#    platform
#    psutil
#    pywintypes
#    random
#    re
#    resource
#    scandir
#    sendfile
#    shutil
#    signal
#    socket
#    ssl
#    stat
#    string
#    struct
#    tarfile
#    tempfile
#    threading
#    traceback
#    types
#    unittest
#    unittest2
#    warnings
#    win32api
#    win32con
#    win32net
#    win32security
#    winreg
