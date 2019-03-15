# LoginExampleSharedPreferences
This app will easily help you to build a app on Login and Registartion using Shared Preferences.<br>
Interface for accessing and modifying preference data returned by Context#getSharedPreferences. For any particular set of preferences, there is a single instance of this class that all clients share. Modifications to the preferences must go through an Editor object to ensure the preference values remain in a consistent state and control when they are committed to storage. Objects that are returned from the various get methods must be treated as immutable by the application.

Note: This class provides strong consistency guarantees. It is using expensive operations which might slow down an app. Frequently changing properties or properties where loss can be tolerated should use other mechanisms. For more details read the comments on Editor#commit() and Editor#apply().

