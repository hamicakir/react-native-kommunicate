
Pod::Spec.new do |s|
  s.name         = "RNReactNativeKommunicate"
  s.version      = "1.0.0"
  s.summary      = "RNReactNativeKommunicate"
  s.description  = <<-DESC
                  RNReactNativeKommunicate
                   DESC
  s.homepage     = ""
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "author@domain.cn" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/author/RNReactNativeKommunicate.git", :tag => "master" }
  s.source_files  = "RNReactNativeKommunicate/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  