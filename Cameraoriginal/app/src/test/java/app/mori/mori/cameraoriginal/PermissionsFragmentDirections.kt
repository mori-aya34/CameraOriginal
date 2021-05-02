package app.mori.mori.cameraoriginal

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections


public class PermissionsFragmentDirections {
    private fun PermissionsFragmentDirections() {}

    fun actionPermissionsToCamera(): NavDirections {
        return ActionOnlyNavDirections(R.id.action_permissions_to_camera)
    }
}