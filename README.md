# RuntimePermissionHelper
Android app example to ask Runtime Permissions in easy way using a single java class as library.

# Features
- Easy to ask Runtime permission
- Write less and clean code


# Sample Code

        /*
        Ask for Runtime Permission using Library
         */
            PermissionsUtil.askPermission(MainActivity.this, PermissionsUtil.STORAGE, new PermissionsUtil.PermissionListener() {
                @Override
                public void onPermissionResult(boolean isGranted) {
                    if (isGranted) {
                        //Write code that required Runtime Permission
                    }
                }
            });

    
    /*
    onRequestPermissionsResult of Library
    */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        PermissionsUtil.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
