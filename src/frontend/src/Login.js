import './index.css';
import './global.css';

import logo from './imgs/reColetaLogo.png'

function Login() {
  return (
    <div className="App">
      <div class="login-container">
        <div class="login-box-background">
            <div class="login-box-container">
                <div class="container-login-logo">
                    <img class="login-logo" src={logo} alt="reColeta"/>
                </div>
                <div class="login-box">
                    <span>Login</span>
                    <form class="login-form">
                        <div class="login-form-profile-icon">
                            <img class="login-profile" src="https://i.ibb.co/2W1PfQ6/default-User.png" alt="profile"/>
                        </div>
                        <div class="login-form-welcome">
                            <span>Bem vindo, User name</span>
                        </div>
                        
                        <span>Email :</span>
                        <input type="text" placeholder="Email do usuário"/>
                        <span>Senha :</span>
                        <input type="password" placeholder="Senha"/>
                        <div class="login-button">
                            <a href="../userArea/index.html" class="button">Entrar</a>
                        </div>
                        <div class="login-forgot-password">
                            <a href="">Esqueceu sua senha ?</a>
                        </div>
                    </form>
                </div>
                <div class="login-new-user">
                    <a href="">Ainda não tem cadastro ?</a>
                </div>
            </div>
        </div>
    </div>
   </div>
  );
}

export default Login;
