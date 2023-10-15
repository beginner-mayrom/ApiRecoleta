
import './global.css';
import './userArea.module.css'
import './bootstrap-5.2.3-dist/css/bootstrap.min.css'

import perfil from './imgs/perfil.png'

import React from 'react';

function UserArea() {
  return (
      <body>
        <header className="nav-box-background">
          <nav className="navbar navbar-expand-lg">
            <a className="navbar-brand" href="../userArea/index.html">
              <div className="username-container">
                <img src={perfil} width="30" height="30" className="d-inline-block align-top" alt="" />
                <span>John Doe</span>
              </div>
            </a>
            <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
              <span className="navbar-toggler-icon"></span>
            </button>
            <div className="collapse navbar-collapse" id="navbarNav">
              <ul className="navbar-nav">
                <li className="nav-item">
                  <a className="nav-link active" aria-current="page" href="#">
                    Nova coleta
                  </a>
                </li>
                <li className="nav-item">
                  <a className="nav-link" href="#">
                    Histórico de coletas
                  </a>
                </li>
                <li className="nav-item">
                  <a className="nav-link" href="#">
                    Meus Projetos
                  </a>
                </li>
              </ul>
            </div>
          </nav>
        </header>

        <div className="container">
          <div className="container-content active-section">
            <div className="profile-header">
              <p>Área do usuário</p>
              <div className="profile-header-photo">
                <img  src={perfil} width="250" alt="perfil" />
              </div>
            </div>
            <section className="profile-section">
              <div className="profile-section-title">
                <span>Perfil</span>
              </div>
              <div className="profile-section-border">
                <div className="profile-user-information">
                  <span>Nome</span>
                  <p>John Doe</p>
                  <span>E-mail</span>
                  <p>teste@teste.com.br</p>
                  <span>Telefone</span>
                  <p>(11)99999-0000</p>
                </div>
                <div className="profile-buttons">
                  <button type="submit">Alterar senha</button>
                  <button type="submit">Editar perfil</button>
                </div>
              </div>
            </section>
            <section className="profile-section">
              <div className="profile-section-title">
                <span>Estatísticas</span>
              </div>
              <div className="profile-section-border">
                <div className="profile-stats-information"></div>
              </div>
            </section>
          </div>
          <div className="container-content">
            <div className="container-user-actions-background">
              <div className="container-user-actions">
                <div className="profile-section-title">
                  <span>Ações do usuário</span>
                </div>
                <div className="profile-section-border">
                  <div className="user-actions-icons">
                    <a href="/">
                      <img className="pressable-icons" src="../../img/userArea/CadastrarPontoColeta.png" alt="" />
                    </a>
                    <a href="">
                      <img className="pressable-icons" src="../../img/userArea/CadastrarNovoProjeto.png" alt="" />
                    </a>
                    <a href="../newCollect/index.html">
                      <img className="pressable-icons" src="../../img/userArea/CadastrarResidos.png" alt="" />
                    </a>
                    <a href="../SearchPoint/index.html">
                      <img className="pressable-icons" src="../../img/userArea/BuscarPontoColeta.png" alt="" />
                    </a>
                    <a href="">
                      <img className="pressable-icons" src="../../img/userArea/BuscarProjetos.png" alt="" />
                    </a>
                    <a href="">
                      <img className="pressable-icons" src="../../img/userArea/BuscarResidos.png" alt="" />
                    </a>
                  </div>
                </div>
              </div>
              <div className="container-user-demands">
                <div className="profile-section-title">
                  <span>Demandas ativas</span>
                </div>
                <div className="profile-section-border">
                  <div className="profile-active-demands"></div>
                </div>
              </div>
            </div>
          </div>
          <div className="container-content">
            <div className="container-user-actions-background">
              <div className="container-user-actions">
                <div className="profile-section-title">
                  <span>Notícias</span>
                </div>
                <div className="profile-section-border">
                  <div className="user-actions-icons"></div>
                </div>
              </div>
              <div className="container-user-demands">
                <div className="profile-section-title">
                  <span>Projetos</span>
                </div>
                <div className="profile-section-border">
                  <div className="profile-active-demands"></div>
                </div>
              </div>
            </div>
          </div>
          <div className="container-content">
            <div className="container-my-address">
              <div className="container-gradient">
                <div className="container-white">
                  <div className="container-my-address-title">Meus resíduos</div>
                  <div className="information-block"></div>
                  <div className="information-block"></div>
                  <div className="new-address">
                    <span>Novo resíduo</span>
                    <img src="../../img/btn-adicionar.svg" alt="Botão para adicionar novo endereço" />
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div className="container-content">
            <div className="container-my-address">
              <div className="container-gradient">
                <div className="container-white">
                  <div className="container-my-address-title">Meus Endereços</div>
                  <div className="information-block"></div>
                  <div className="information-block"></div>
                  <div className="new-address">
                    <span>Novo endereço</span>
                    <img src="../../img/btn-adicionar.svg" alt="Botão para adicionar novo endereço" />
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div className="dot-menu"></div>
        </div>
        <footer className="footer-container">
          <img src="../../img/Vector.svg" alt="" />
          <img src="../../img/notification-bell.svg" alt="" />
        </footer>
      </body>
  );
}

export default UserArea;
